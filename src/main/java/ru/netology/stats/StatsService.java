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
        int sum = calculateSum(averageSales);
        int average = sum / averageSales.length;
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
                sumMoreAverage++;
            }

        }
        return sumMoreAverage;
    }

    public int calculateLessAverageSales(int[] lessAverageSales) {
        int sumLessAverage = 0;
        int average = calculateAverage(lessAverageSales);
        for (int lessAverageSale : lessAverageSales) {
            if (lessAverageSale < average) {
                sumLessAverage++;
            }
        }
        return sumLessAverage;
    }
}
