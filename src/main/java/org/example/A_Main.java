package org.example;
import java.util.Scanner;
import java.io.*;

public class A_Main {

    /**
     * import java.util.Scanner
     * Definition sout
     *
     * @param args
     */
        public static void main(String[] args) {

        ImportFile.importFile();
        CurrencyCalculation status = new CurrencyCalculation();
        B_Currencys [] finalCurrency = new B_Currencys[ImportFile.importFile().length];
        finalCurrency = ImportFile.importFile();


        final Scanner scan = new Scanner(System.in);

        System.out.println("Currency to buy: " + status.getBuy());
        System.out.println("Currency to sell: " + status.getSell());
        System.out.println("++++++++++++++++++++++");
        System.out.println("0: Select currency to buy");
        System.out.println("1: Select currency to sell");
        System.out.println("2: Chose amount to be converted:");
        System.out.println("Please chose an option (<<x>> to exit): ");


        /**
         * @param userInput
         */

        final String userInput = scan.next();
        System.out.print(userInput);
        final C_Interface clear = new C_Interface();

        switch (userInput) {
            case "0":
                System.out.println("Enter a currency's name or part of it (>>x<< to exit): ");
                final Scanner scan2 = new Scanner(System.in);
                final String userInputCur1 = scan.next();

                int count = 0;

                for (B_Currencys element : finalCurrency) {

                    if (element.containsString(userInputCur1)) {            // Wir schauen, auf wie viele Währungen die Eingabe passt
                        count++;
                    }
                }

                    if (count > 1) {                                                // Wir erstellen neues Array, um dem
                        B_Currencys [] matchUserInput = new B_Currencys[count];     // Nutzer die Optionen zu zeigen,
                    } else {                                                        // wenn es mehrere passende Währungen gibt
                        for (B_Currencys element1 : finalCurrency) {

                            if (element1.containsString(userInputCur1)) {   // Methode um Currency to Buy festzusetzen,
                                status.setBuy(element1.getName());          // falls es nur eine passende Währung gibt.
                                System.out.println(status.getBuy());
                            }

                    }
                }
                break;
                    case "1":
                System.out.println("Enter a currency's name or part of it (>>x<< to exit): ");
                break;
            case "2":
                System.out.println("Enter an amount: ");
                final String AMOUNT = scan.next();
                break;
            case "x":
                clear.clearConsole();
                break;
            default:
                System.out.println("bye");
                ;
        }





    }






}


