package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {

    @Test
    public void testRemainWhenAmountLessThanBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 800;
        int expectedResult = 200;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemainWhenAmountIsMultipleOfBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;
        int expectedResult = 0;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemainWhenAmountGreaterThanBoundary() {

        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1700;
        int expectedResult = 300;

        int actualResult = cashBackHacker.remain(amount);

        assertEquals(actualResult, expectedResult);
    }
}
