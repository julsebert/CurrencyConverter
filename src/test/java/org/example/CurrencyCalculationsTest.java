package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyCalculationsTest {

    @Test
    public void testCurrencyCalculation(){
        CurrencyCalculation currencyCalculationDolEur = new CurrencyCalculation();
        currencyCalculationDolEur.setBuy("American dollar");
        currencyCalculationDolEur.setSell("Euro");

        CurrencyCalculation currencyCalculationPesoSw = new CurrencyCalculation();
        currencyCalculationPesoSw.setBuy("Mexican peso");
        currencyCalculationPesoSw.setSell("Swiss franc");

        Assert.assertEquals(0, currencyCalculationDolEur.calculationAmount(-20));


        Assert.assertEquals(0, currencyCalculationPesoSw.calculationAmount(0));

    }
}
