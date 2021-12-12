package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAvg() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvg(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        int[] numberMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMax(numberMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        int[] numberMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMin(numberMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinAvg() {
        StatsService service = new StatsService();
        int[] numberMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMinAvg(numberMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxAvg() {
        StatsService service = new StatsService();
        int[] numberMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMaxAvg(numberMonth);

        assertEquals(expected, actual);
    }
}