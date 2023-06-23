package org.example;

import java.util.Scanner;

public class Main {

    /**
     * <h1>Softwareprojekt - Currency Converter</h1> <br>
     * <h2>Beschreibung:</h2>
     * Ein Währungsumrechner, der mithilfe von SDR rechnet. In diesem Fall beinhaltet er 38 Währungen,
     * die aus einer Tabelle, basierend auf imf.org Daten, eingelesen werden. Im Allgemeinen wurde flexibel und
     * objektorientiert gearbeitet, man kann zum Beispiel auch eine andere SDR Tabelle einfügen.*
     * Der User kann zwei Währungen eingeben, zwischen denen ein gewünschter Betrag umgerechnet wird.
     * Gibt man eine Währung ein, zu der es mehrere Ergebnisse gibt, kann man über eine integrierte Suchfunktion
     * die passende Währung auswählen. Man muss die Währungsnamen nicht komplett ausschreiben.
     * Gibt einen negativen Wert ein, wird der gewünschte Betrag auf 0 gesetzt.
     *
     * <h2>Autoren:</h2>
     * Elisabeth Götz, Matrikel-Nr. 45827 <br>
     * Julia Ebert, Matrikel-Nr. 45877 <br>
     * Malena Böckmann, Matrikel-Nr. 46083 <br>
     */
    public static void main(String[] args) {

        ImportFile.importFile();
        CurrencyCalculation status = new CurrencyCalculation();

        boolean condition = true;

        while (condition) {                                                                  // while loop, um flexibel neue Währungen eingeben zu können

            final Scanner scan = new Scanner(System.in);

            System.out.println("Currency to buy: " + status.getBuy());
            System.out.println("Currency to sell: " + status.getSell());
            System.out.println("++++++++++++++++++++++");
            System.out.println("0: Select currency to buy");
            System.out.println("1: Select currency to sell");
            System.out.println("2: Choose amount to be converted");
            System.out.println("Please choose an option (>>x<< to exit): ");


            final String userInput = scan.next();
            final Interface clear = new Interface();

            FindCurrencys findCurrencys = new FindCurrencys();


        /*
          Mit einer switch case Methode legen wir den Output für die Optionen des Users fest.<br>
          case "0": gibt dem User die Option eine Währung auszuwählen, die umgerechnet werden soll.
          Dabei hat er freie Eingabewahl.
          Je nachdem, wie viele Währungen der Eingabe ähneln, wird dem User eine nummerierte Liste dargeboten,
          indem er sich für seine finale Option entscheidet.<br>
          case "1": bietet dem User, durch dasselbe Verfahren die Auswahl für die Ausgabewährung. <br>
          case "2": ermöglicht dem User letztendlich, den Wert festzulegen, der umgerechnet werden soll und gibt das Ergebnis aus.
          Dabei werden die Zahlen auf zwei Nachkommastellen gekürzt.<br>
          der default case leert letztendlich die Konsole und stoppt die Eingabe.
         */


            switch (userInput) {

                case "0" -> status.setBuy(findCurrencys.findCurrency(scan, status));


                case "1" -> status.setSell(findCurrencys.findCurrency(scan, status));


                case "2" -> {
                    System.out.println("Enter an amount: ");
                    final double AMOUNT = scan.nextDouble();
                    double result = status.calculationAmount(AMOUNT);
                    clear.getSpace(6);

                    // wir formatieren die Variablen, runden auf zwei Nachkommastellen
                    String formattedResult = String.format("%.2f", result);
                    String formattedAmount = String.format("%.2f", AMOUNT);


                    //System.out.format("Buying %s of %s", formattedAmount, buyStatus);


                    System.out.format("Buying " + formattedAmount + " of " + status.getBuy() + "\n");
                    System.out.format("Selling " + formattedResult + " of " + status.getSell() + "\n");
                    System.out.println("++++++++++++++++++++++");
                }
                default -> {
                    clear.getSpace(50);
                    condition = false;
                }
            }

        }

    }

}


