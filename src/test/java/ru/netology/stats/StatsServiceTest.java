package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "calculateSum, [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18], 180",
    })
    void calculateSum(String test, int[] sales, int expected) {
        StatsService service = new StatsService();
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "'calculateAverage'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18],15",
    })
    void calculateAverage(String test, int[] sales, int expected) {
        StatsService service = new StatsService();
        int actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "'calculateMaxSales'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18],8",
    })
    void calculateMaxSales(String test, int[] sales, int expected) {
        StatsService service = new StatsService();
        int actual = service.calculateMaxSales(sales);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "'calculateMinSales'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18],9",
    })
    void calculateMinSales(String test, int[] sales, int expected) {
        StatsService service = new StatsService();
        int actual = service.calculateMinSales(sales);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "'calculateMoreAverageSales'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18],5",
    })
    void calculateMoreAverageSales(String test, int[] sales, int expected) {
        StatsService service = new StatsService();
        int actual = service.calculateMoreAverageSales(sales);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "'calculateLessAverageSales'[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18],5",
    })
    void calculateLessAverageSales(String test, int[] sales, int expected) {
        StatsService service = new StatsService();
        int actual = service.calculateLessAverageSales(sales);
        assertEquals(expected, actual);
    }
}