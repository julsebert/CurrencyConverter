package org.example;
import java.sql.SQLOutput;
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
            /*CurrencyCalculation test = new CurrencyCalculation();
            test.calculationAmount(50);
            String result2 = String.valueOf(test.calculationAmount(50));
            System.out.println(result2);

             */




        ImportFile.importFile();
        CurrencyCalculation status = new CurrencyCalculation();
        B_Currencys [] finalCurrency = new B_Currencys[ImportFile.importFile().length];
        finalCurrency = ImportFile.importFile();

        boolean condition = true;

        while (condition){
        final Scanner scan = new Scanner(System.in);

        System.out.println("Currency to buy: " + status.getBuy());
        System.out.println("Currency to sell: " + status.getSell());
        System.out.println("++++++++++++++++++++++");
        System.out.println("0: Select currency to buy");
        System.out.println("1: Select currency to sell");
        System.out.println("2: Chose amount to be converted");
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
                        final Scanner scan02 = new Scanner(System.in);
                        final String userInputCur1 = scan.next();

                        int count = 0;

                        for (B_Currencys element : finalCurrency) {

                            if (element.containsString(userInputCur1))
                                count++;         // Wir schauen, auf wie viele Währungen die Eingabe passt


                        }
                        int count1 = 0;
                        String[] matchUserInput = new String[count];

                        if (count > 1) {                                                // Wir erstellen neues Array, um dem

                            for (B_Currencys element1 : finalCurrency) {
                                if (element1.containsString(userInputCur1)) {                   // Nutzer die Optionen zu zeigen,
                                    matchUserInput[count1] = element1.getName();
                                    count1++;
                                }
                            }

                            System.out.println();
                            System.out.println();
                            System.out.println();


                            System.out.println("Currency to buy: " + status.getBuy());
                            System.out.println("Currency to sell: " + status.getSell());
                            System.out.println("++++++++++++++++++++++");


                            for (int i = 0; i < matchUserInput.length; i++) {
                                System.out.println(i + ": " + matchUserInput[i]);
                            }


                            System.out.println();

                            Scanner scan3 = new Scanner(System.in);
                            System.out.println("Select a currency by index: ");
                            final int userInput3 = scan.nextInt();

                            status.setBuy(matchUserInput[userInput3]);
                            System.out.println(status.getBuy());

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
                        final Scanner scan4 = new Scanner(System.in);
                        final String userInputCur4 = scan.next();

                        int count4 = 0;

                        for (B_Currencys element : finalCurrency) {

                            if (element.containsString(userInputCur4))
                                count4++;                                               // Wir schauen, auf wie viele Währungen die Eingabe passt


                        }
                        int count41 = 0;
                        String[] matchUserInput4 = new String[count4];

                        if (count4 > 1) {                                                // Wir erstellen neues Array, um dem

                            for (B_Currencys element1 : finalCurrency) {
                                if (element1.containsString(userInputCur4)) {                   // Nutzer die Optionen zu zeigen,
                                    matchUserInput4[count41] = element1.getName();
                                    count41++;
                                }
                            }

                            System.out.println();
                            System.out.println();
                            System.out.println();


                            System.out.println("Currency to buy: " + status.getBuy());
                            System.out.println("Currency to sell: " + status.getSell());
                            System.out.println("++++++++++++++++++++++");


                            for (int i = 0; i < matchUserInput4.length; i++) {
                                System.out.println(i + ": " + matchUserInput4[i]);
                            }


                            System.out.println();

                            Scanner scan43 = new Scanner(System.in);
                            System.out.println("Select a currency by index: ");
                            final int userInput4 = scan.nextInt();

                            status.setSell(matchUserInput4[userInput4]);
                            System.out.println(status.getSell());

                        } else {                                                        // wenn es mehrere passende Währungen gibt
                            for (B_Currencys element1 : finalCurrency) {

                                if (element1.containsString(userInputCur4)) {   // Methode um Currency to Sell festzusetzen,
                                    status.setSell(element1.getName());          // falls es nur eine passende Währung gibt.
                                    System.out.println(status.getSell());
                                }

                            }


                        }
                        break;
                    case "2":
                        System.out.println("Enter an amount: ");
                        final Scanner scan6 = new Scanner(System.in);
                        final double AMOUNT = scan.nextDouble();
                        double result = status.calculationAmount(AMOUNT);
                        System.out.println("Buying " + AMOUNT + " of " + status.getBuy());
                        System.out.println("Selling " + result + " of " + status.getSell());
                        System.out.println("++++++++++++++++++++++");

                        break;
                    case "x":
                        clear.clearConsole();
                        condition = false;

                        break;
                    default:
                        clear.clearConsole();
                        condition = false;

                }

            }





    }






}


