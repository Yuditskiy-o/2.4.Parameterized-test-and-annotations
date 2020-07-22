package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sumSales) {
        int sum = 0;
        for (int i : sumSales) {
            sum += i;
        }
        return sum;
    }

    public int calculateAverage(int[] averageSales) {
        int average = 0;
        int sum = 0;
        for (int i : averageSales) {
            sum += i;
        }
        average = sum / averageSales.length;
        return average;
    }

    public int calculateMaxSales(int[] maxSales) {
        int maxMonth = 0;
        int maxSale = maxSales[0];
        for (int i = 0; i < maxSales.length; i++) {
            if (maxSale <= maxSales[i]) {
                maxSale = maxSales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    public int calculateMinSales(int[] minSales) {
        int minMonth = 0;
        int minSale = minSales[0];
        for (int i = 0; i < minSales.length; i++) {
            if (minSale >= minSales[i]) {
                minSale = minSales[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }

    public int calculateMoreAverageSales(int[] moreAverageSales) {
        int average = calculateAverage(moreAverageSales);
        int sumMoreAverage = 0;
        for (int moreAverageSale : moreAverageSales) {
            if (moreAverageSale > average) {
                moreAverageSale = 1;
                sumMoreAverage += moreAverageSale;
            }

        }
        return sumMoreAverage;
    }

    public int calculateLessAverageSales(int[] lessAverageSales) {
        int average = calculateAverage(lessAverageSales);
        int sumLessAverage = 0;
        for (int moreAverageSale : lessAverageSales) {
            if (moreAverageSale < average) {
                moreAverageSale = 1;
                sumLessAverage += moreAverageSale;
            }
        }
        return sumLessAverage;
    }
}
