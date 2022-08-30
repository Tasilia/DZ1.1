package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.Assert;
//import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void beforeTheBoundaryForJunit4() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void afterTheBoundaryForJunit4() {
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void onTheBoundaryForJunit4() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void beforeTheBoundaryForJunitJupiter() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
}

    @Test
    public void afterTheBoundaryForJunitJupiter() {
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void onTheBoundaryForJunitJupiter() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
