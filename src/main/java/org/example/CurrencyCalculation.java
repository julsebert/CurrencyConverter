package org.example;
import java.text.DecimalFormat;


import javax.sound.midi.Soundbank;

public class CurrencyCalculation {

    String buy = "not set";
    String sell = "not set";

    public void setBuy(String buy){
        this.buy=buy;
    }

    public String getBuy(){
        return buy;
    }



    public void setSell(String sell){
        this.sell=sell;
    }

    public String getSell(){
        return sell;
    }



    public double calculationAmount(double amount){
        B_Currencys [] finalCurrency = new B_Currencys[ImportFile.importFile().length];
        finalCurrency = ImportFile.importFile();
        double userAmount = amount;
        double sdrBuy = 0.0;
        double sdrSell = 0.0;

        for (B_Currencys element : finalCurrency) {
            if(element.containsString(buy)){
                sdrBuy = element.getSdr();
            }
        }

        for (B_Currencys element : finalCurrency){
            if(element.containsString(sell)){
                sdrSell = element.getSdr();
            }
        }

        double finalAmount = (userAmount / sdrBuy) * sdrSell;





        return finalAmount;

    }





}
