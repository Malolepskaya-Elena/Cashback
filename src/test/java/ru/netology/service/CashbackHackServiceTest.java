package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        int amount = 200;
        int expected = 800;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
     @Test
    public void noRemain() {
         int amount = 0;
         int expected = 1000;

         CashbackHackService service = new CashbackHackService();
         int actual = service.remain(amount);

         assertEquals(actual, expected);
     }

    @Test
    public void allRemain() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}