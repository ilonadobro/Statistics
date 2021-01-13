package ru.netology.stats;

public class StatsService {
    public int sumSales (int[] amount) {
        int sum = 0;
        for (int monthSale : amount){
            sum = sum + monthSale;
        }
        return sum;
    }

    public float avgSum(int[] amount) {
        return sumSales(amount) / amount.length;
    }

    public int maxSales(int[] amount) {
        int month = 0;
        int maxSale = 0;
        int maxMonth = 0;
        for (int value: amount) {
            month = month + 1;
            if (value >= maxSale) {
                maxMonth = month;
                maxSale = value;
            }
        }
        return maxMonth;
    }
    public int minSales(int[] amount) {
        int month = 0;

        int minSale = 0;
        for (int value: amount) {
            if (value > minSale) {
                minSale = value;
            }
        }

        int minMonth = 0;
        for (int value: amount) {
            month = month + 1;
            if (value <= minSale) {
                minMonth = month;
                minSale = value;
            }
        }
        return minMonth;
    }

    public int minAvgSales (int[] amount) {
       float minAvgSales = avgSum(amount);
       int monthCount = 0;
       for (int value: amount) {
           if (value < minAvgSales) {
               monthCount = monthCount + 1;
           }
       }
       return monthCount;
    }
    public int maxAvgSales (int[] amount) {
        float maxAvgSales = avgSum(amount);
        int monthCount = 0;
        for (int value: amount) {
            if (value > maxAvgSales) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }
}
