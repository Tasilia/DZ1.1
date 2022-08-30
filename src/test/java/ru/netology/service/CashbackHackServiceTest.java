package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    void beforeTheBoundary(){
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void afterTheBoundary(){
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void onTheBoundary(){
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
