package org.example;

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

        Currencys[] finalCurrency = new Currencys[ImportFile.importFile().length];
        finalCurrency = ImportFile.importFile();
        double userAmount = amount;
        double sdrBuy = 0.0;
        double sdrSell = 0.0;

        for (Currencys element : finalCurrency) {

            if(element.containsString(buy)){
                sdrBuy = element.getSdr();
            }
        }

        for (Currencys element : finalCurrency){

            if(element.containsString(sell)){
                sdrSell = element.getSdr();
            }
        }

        double finalAmount = (userAmount / sdrBuy) * sdrSell;

        return finalAmount;

    }

}
