package ru.netology.stats;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Сервис для тестирования статистики")
class StatsServiceTest {

    @Test
    @DisplayName("Сумма всех продаж")
    void calculateSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateSum(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Средняя сумму продаж в месяц")
    void calculateAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateAverage(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Месяц, в котором был пик продаж")
    void calculateMaxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateMaxSales(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Месяц, в котором было минимум продаж")
    void calculateMinSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateMinSales(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Количество месяцев с продажами выше среднего")
    void calculateMoreAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateMoreAverageSales(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Количество месяцев с продажами ниже среднего")
    void calculateLessAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.calculateLessAverageSales(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}