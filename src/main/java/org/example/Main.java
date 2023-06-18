package org.example;
import java.util.Scanner;

public class Main {

    /**
     * import java.util.Scanner
     * Definition sout
     *
     * @param args
     */
        public static void main(String[] args) {

        ImportFile.importFile();
        CurrencyCalculation status = new CurrencyCalculation();
        Currencys[] finalCurrency = new Currencys[ImportFile.importFile().length];
        finalCurrency = ImportFile.importFile();

        boolean condition = true;

        while (condition){                                                                  // while loop, um flexibel neue Währungen eingeben zu können

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
        final Interface clear = new Interface();


                switch (userInput) {


                    case "0":
                        System.out.println("Enter a currency's name or part of it (>>x<< to exit): ");

                        final Scanner scan01 = new Scanner(System.in);
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

                            Scanner scan02 = new Scanner(System.in);
                            System.out.println("Select a currency by index: ");
                            final int userInput01 = scan.nextInt();

                            status.setBuy(matchUserInput[userInput01]);
                            System.out.println(status.getBuy());


                        } else {                                                                // wenn es mehrere passende Währungen gibt
                            for (Currencys element1 : finalCurrency) {

                                if (element1.containsString(userInputCur1)) {                   // Methode um Currency to Buy festzusetzen,
                                    status.setBuy(element1.getName());                          // falls es nur eine passende Währung gibt.
                                    System.out.println(status.getBuy());
                                }
                            }
                        }
                        break;



                    case "1":
                        System.out.println("Enter a currency's name or part of it (>>x<< to exit): ");

                        final Scanner scan11 = new Scanner(System.in);
                        final String userInputCur2 = scan.next();
                        int count11 = 0;

                        for (Currencys element : finalCurrency) {

                            if (element.containsString(userInputCur2)) {
                                count11++;                                                      // Wir schauen, auf wie viele Währungen die Eingabe passt
                            }
                        }

                        int count12 = 0;
                        String[] matchUserInput11 = new String[count11];

                        if (count11 > 1) {                                                      // Wir erstellen neues Array, um dem
                            for (Currencys element1 : finalCurrency) {
                                if (element1.containsString(userInputCur2)) {                   // Nutzer die Optionen zu zeigen,
                                    matchUserInput11[count12] = element1.getName();
                                    count12++;
                                }
                            }
                            System.out.println();
                            System.out.println();
                            System.out.println();

                            System.out.println("Currency to buy: " + status.getBuy());
                            System.out.println("Currency to sell: " + status.getSell());
                            System.out.println("++++++++++++++++++++++");

                            for (int i = 0; i < matchUserInput11.length; i++) {
                                System.out.println(i + ": " + matchUserInput11[i]);
                            }

                            System.out.println();   // nötig?

                            Scanner scan12 = new Scanner(System.in);
                            System.out.println("Select a currency by index: ");
                            final int userInput12 = scan.nextInt();

                            status.setSell(matchUserInput11[userInput12]);
                            System.out.println(status.getSell());

                        } else {                                                                // wenn es mehrere passende Währungen gibt
                            for (Currencys element1 : finalCurrency) {

                                if (element1.containsString(userInputCur2)) {                   // Methode um Currency to Sell festzusetzen,
                                    status.setSell(element1.getName());                         // falls es nur eine passende Währung gibt.
                                    System.out.println(status.getSell());
                                }
                            }
                        }
                        break;



                    case "2":
                        System.out.println("Enter an amount: ");

                        final Scanner scan21 = new Scanner(System.in);
                        final double AMOUNT = scan.nextDouble();
                        double result = status.calculationAmount(AMOUNT);

                        System.out.println("Buying " + AMOUNT + " of " + status.getBuy());
                        System.out.println("Selling " + result + " of " + status.getSell());
                        System.out.println("++++++++++++++++++++++");

                        break;



                    default:
                        clear.clearConsole();
                        condition = false;

                }

            }

    }

}


