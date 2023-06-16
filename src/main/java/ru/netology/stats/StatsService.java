package ru.netology.stats;

public class StatsService {
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

    public int mounthMax(long[] sales) {
        int mountMax = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[mountMax]) {
                mountMax = i;
            }
        }
        return mountMax + 1;
    }

    public int mounthMin(long[] sales) {
        int mounthMin = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[mounthMin]) {
                mounthMin = i;

            }
        }
        return mounthMin + 1;
    }

    public int belowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;

            }
        }
        return counter;

    }

    public int aboveAverage(long[] sales) {
        int quantity = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                quantity++;

            }
        }
        return quantity;


    }
}
