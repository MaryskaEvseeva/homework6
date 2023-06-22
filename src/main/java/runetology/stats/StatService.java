package runetology.stats;

public class StatService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }


    public long average(long[] sales) {

        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;

            }

        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;

            }

        }
        return monthMinimum + 1;
    }

    public int salesBellowAverage(long[] sales) {
        int couter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                couter++;

            }
        }
        return couter;
    }

    public int salesAboveAverage(long[] sales) {
        int couter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                couter++;

            }
        }
        return couter;
    }
}
