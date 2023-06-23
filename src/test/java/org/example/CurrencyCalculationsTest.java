package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyCalculationsTest {

    @Test
    public void testCurrencyCalculation(){
        CurrencyCalculation currencyCalculationDolEur = new CurrencyCalculation();
        currencyCalculationDolEur.setBuy("Australian dollar");
        currencyCalculationDolEur.setSell("Euro");

        Assert.assertEquals(12.56, currencyCalculationDolEur.calculationAmount(20), 0.01);
        Assert.assertEquals(31.40, currencyCalculationDolEur.calculationAmount(50), 0.01);
        Assert.assertEquals(0, currencyCalculationDolEur.calculationAmount(-20), 0.01);

        CurrencyCalculation currencyCalculationPesoSw = new CurrencyCalculation();
        currencyCalculationPesoSw.setBuy("Mexican peso");
        currencyCalculationPesoSw.setSell("Swiss franc");

        Assert.assertEquals(0.16, currencyCalculationPesoSw.calculationAmount(3), 0.01);
        Assert.assertEquals(1.83, currencyCalculationPesoSw.calculationAmount(35), 0.01);
        Assert.assertEquals(0,currencyCalculationPesoSw.calculationAmount(-77), 0.01);





    }
}
