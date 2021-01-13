package ru.netology.stats;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void sumSales() {
        StatsService service = new StatsService();
        int[] testData = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.sumSales(testData);
        assertEquals(180, result);
    }

    @Test
    void avgSales() {
        StatsService service = new StatsService();
        int[] testData = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float result = service.avgSum(testData);
        assertEquals((float) 15, result);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] testData = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.maxSales(testData);
        assertEquals(8, result);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] testData = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.minSales(testData);
        assertEquals(9, result);
    }

    @Test
    void minAvgSales() {
        StatsService service = new StatsService();
        int[] testData = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.minAvgSales(testData);
        assertEquals(5, result);
    }
    @Test
    void maxAvgSales() {
        StatsService service = new StatsService();
        int[] testData = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.maxAvgSales(testData);
        assertEquals(5, result);
    }
}