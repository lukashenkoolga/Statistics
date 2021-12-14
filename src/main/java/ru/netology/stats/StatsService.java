package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMin(int[] sales) {
        int minMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMinAvg(int[] sales) {
        int quantity = 0;
        int Avg = findAvg(sales);
        for (int sale : sales) {
            if (sale < findAvg(sales)) {

                quantity += 1;
            }
        }
        return quantity;
    }

    public int findMaxAvg(int[] sales) {
        int quantity = 0;
        int Avg = findAvg(sales);
        for (int sale : sales) {
            if (sale > Avg) {

                quantity += 1;
            }
        }
        return quantity;
    }

}