package org.example;

import java.util.Scanner;

public class FindCurrencys {

    public String findCurrency(Scanner scan, CurrencyCalculation status) {

        Interface clear = new Interface();
        Currencys[] finalCurrency = ImportFile.importFile();

        String currency = "";

        System.out.println("Enter a currency's name or part of it (>>x<< to exit): ");

        final String userInputCur1 = scan.next();

        int count01 = 0;
        for (Currencys element : finalCurrency) {
            if (element.containsString(userInputCur1))
                count01++;                                                      // Wir schauen, auf wie viele Währungen die Eingabe passt
        }

        int count02 = 0;
        String[] matchUserInput = new String[count01];

        if (count01 > 1) {                                                      // Wir erstellen neues Array, um dem
            for (Currencys element1 : finalCurrency) {
                if (element1.containsString(userInputCur1)) {                   // Nutzer die Optionen zu zeigen,
                    matchUserInput[count02] = element1.getName();
                    count02++;
                }
            }

            clear.getSpace(6); // sorgt für Abstände zwischen den einzelnen Ausführungen

            System.out.println("Currency to buy: " + status.getBuy());
            System.out.println("Currency to sell: " + status.getSell());
            System.out.println("++++++++++++++++++++++");

            for (int i = 0; i < matchUserInput.length; i++) {
                System.out.println(i + ": " + matchUserInput[i]);
            }
            clear.getSpace(1);


            System.out.println("Select a currency by index: ");

            if (scan.hasNextInt()) {
                final int userInput01 = scan.nextInt();

                if (userInput01 > 0 && userInput01 <= matchUserInput.length - 1) {
                    return matchUserInput[userInput01];
                } else { // Falls der User einen Index eingibt, den es nicht gibt.
                    clear.getSpace(4);
                    System.err.println("Invalid input!");
                    return "not set";
                }
            } else { // Falls der User einen Buchstaben eingibt.
                clear.getSpace(4);
                System.err.println("This input is not a number!");
                return "not set";
            }


        } else if (count01 == 1) {                                               // wenn es mehrere passende Währungen gibt
            for (Currencys element1 : finalCurrency) {

                if (element1.containsString(userInputCur1)) {                   // Methode um Currency to Buy festzusetzen,
                    return element1.getName();
                }
            }
        } else {
            clear.getSpace(4);
            System.err.println("Invalid input!");
            return "not set";
        }

        return currency;
    }
}