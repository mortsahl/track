package com.horsey.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyTest {

    Currency currency = new Currency(10,10,10,10,10);

   @Test
    public void testTotalCashOnHand () {
       assertEquals(1360, currency.getTotalCashOnHand());
    }

    @Test
    public void testReload() {
        currency.setFive(0);
        currency.setTen(2);
        assertEquals(1230, currency.getTotalCashOnHand());
        currency.reload();
        assertEquals(1360, currency.getTotalCashOnHand());
    }
}
