package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashBackHackerTest {

    @Test
    public void testRemainWhenAmountLessThanBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 800;
        int expectedResult = 200;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemainWhenAmountIsMultipleOfBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;
        int expectedResult = 0;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemainWhenAmountGreaterThanBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1700;
        int expectedResult = 300;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(expectedResult, actualResult);
    }
}
