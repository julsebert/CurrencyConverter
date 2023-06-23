package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CurrencysTest {

    @Test
    public void testCurrencys(){

        Currency currencysDollar = new Currency();
        Currency currencysEuro = new Currency();
        currencysDollar.setName("Australian dollar");
        currencysEuro.setName("Euro");

        Assert.assertEquals(true, currencysDollar.containsString("dol"));
        Assert.assertEquals(false, currencysDollar.containsString("eur"));
        Assert.assertEquals(true, currencysEuro.containsString("eur"));
        Assert.assertEquals(false, currencysEuro.containsString(null));

    }

}
