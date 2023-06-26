package org.example;

public class CurrencyCalculation {

    String buy = "not set";
    String sell = "not set";

    /**
     * @param buy Währung die umgerechnet werden soll, kann mit der Methode setBuy() gesetzt werden.
     */

    public void setBuy(String buy) {

        this.buy = buy;
    }

    /**
     *
     * @return Mit der Methode getBuy() kann die Währung ausgegeben werden, die auf buy gesetzt wurde.
     */

    public String getBuy() {

        return buy;
    }

    /**
     * @param sell Währung, in die umgerechnet und ausgegeben werden soll, kann mit der Methode setSell() gesetzt werden.
     */

    public void setSell(String sell) {

        this.sell = sell;
    }

    /**
     *
     * @return Mit der Methode getSell() kann die Währung ausgegeben werden, die auf sell gesetzt wurde.
     */

    public String getSell() {

        return sell;
    }

    /**
     * @param amount Der User gibt über die Konsole einen Betrag ein, der über folgende Methode umgerechnet wird.
     *               Die gesetzte buy-Währung wird mithilfe von SDR in die angefragte sell-Währung umgerechnet.
     * @return Gibt den umgerechneten Betrag zurück. Wenn der über die Konsole eingetragene Betrag negativ ist,
     * wird 0 ausgegeben, da keine negativen Werte möglich sind.
     */


    public double calculationAmount(double amount) {


        Interface clear = new Interface();

        if (amount >= 0) {

            ImportFile importFile = new ImportFile();
            Currency[] finalCurrency = importFile.importFile();

            double sdrBuy = 0.0;
            double sdrSell = 0.0;

            if (!buy.equals("not set") && !sell.equals("not set")) {
                for (Currency element : finalCurrency) {

                    if (element.containsString(buy)) {
                        sdrBuy = element.getSdr();
                    }
                }

                for (Currency element : finalCurrency) {

                    if (element.containsString(sell)) {
                        sdrSell = element.getSdr();
                    }
                }

                return (amount / sdrBuy) * sdrSell;

            } else {

                if (buy.equals("not set") && !sell.equals("not set")) {
                    clear.getSpace(4);
                    System.err.println("You have to set a buy-currency.");
                    return 0;
                } else if (!buy.equals("not set")) {
                    clear.getSpace(4);
                    System.err.println("You have to set a sell-currency.");
                    return 0;
                } else {
                    clear.getSpace(4);
                    System.err.println("You have to set a buy-currency and a sell-currency.");
                    return 0;
                }
            }
        }

        clear.getSpace(4);
        System.err.println("You have to enter a positive amount.");
        return 0;

    }


}


