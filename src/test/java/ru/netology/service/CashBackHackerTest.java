package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackerTest {

    @Test
    void testRemainWhenAmountLessThanBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 800;
        int expectedResult = 200;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRemainWhenAmountIsMultipleOfBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;
        int expectedResult = 0;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRemainWhenAmountGreaterThanBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1700;
        int expectedResult = 300;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(expectedResult, actualResult);
    }
}
