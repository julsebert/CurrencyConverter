package org.example;
import java.util.Scanner;

public class Main {

        /**
         * <h1>Softwareprojekt - Currency Converter</h1> <br>
         * <h2>Beschreibung:</h2>
         * Ein Währungsumrechner, der mithilfe von SDR rechnet. In diesem Fall beinhaltet er 38 Währungen,
         * die aus einer Tabelle, basierend auf imf.org Daten, eingelesen werden. Im Allgemeinen wurde flexibel und
         * objektorientiert gearbeitet, man kann zum Beispiel auch eine andere SDR Tabelle einfügen.
         *
         *
         * Der User kann zwei Währungen eingeben, zwischen denen ein gewünschter Betrag umgerechnet wird.
         * Gibt man eine Währung ein, zu der es mehrer Ergebnisse gibt, kann man über eine integrierte Suchfunktion
         * die passende Währung auswählen. Man muss die Währungsnamen nicht komplett ausschreiben.
         * Gibt einen negativen Wert ein, wird der gewünschte Betrag auf 0 gesetzt.
         *
         *
         * <h2>Autoren:</h2>
         * Elisabeth Götz, Matrikel-Nr. 45827 <br>
         * Julia Ebert, Matrikel-Nr. 45877 <br>
         * Malena Böckmann, Matrikel-Nr. 46083 <br>
         *
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
        System.out.println("Please chose an option (>>x<< to exit): ");




        final String userInput = scan.next();
        final Interface clear = new Interface();


        /**
         * Mit einer switch case Methode legen wir den Output für die Optionen des Users fest.<br>
         * case "0": gibt dem User die Option eine Währung auszuwählen, die umgerechnet werden soll.
         * Dabei hat er freie Eingabewahl.
         * Je nachdem, wie viele Währungen der Eingabe ähneln, wird dem User eine nummerierte Liste dargeboten,
         * indem er sich für seine finale Option entscheidet.<br>
         * case "1": bietet dem User, durch dasselbe Verfahren die Auswahl für die Ausgabewährung. <br>
         * case "2": ermöglicht dem User letztendlich, den Wert festzulegen, der umgerechnet werden soll und gibt das Ergebnis aus.
         * Dabei werden die Zahlen auf zwei Nachkommastellen gekürzt.<br>
         * der default case leert letztendlich die Konsole und stoppt die Eingabe.
         */


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

                            clear.getSpace(); // sorgt für Abstände zwischen den einzelnen Ausführungen

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

                            clear.getSpace();


                        } else {                                                                // wenn es mehrere passende Währungen gibt
                            for (Currencys element1 : finalCurrency) {

                                if (element1.containsString(userInputCur1)) {                   // Methode um Currency to Buy festzusetzen,
                                    status.setBuy(element1.getName());                          // falls es nur eine passende Währung gibt.
                                    clear.getSpace();
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
                            clear.getSpace(); // sorgt für Abstände zwischen den einzelnen Ausführungen

                            System.out.println("Currency to buy: " + status.getBuy());
                            System.out.println("Currency to sell: " + status.getSell());
                            System.out.println("++++++++++++++++++++++");

                            for (int i = 0; i < matchUserInput11.length; i++) {
                                System.out.println(i + ": " + matchUserInput11[i]);
                            }

                            System.out.println();

                            Scanner scan12 = new Scanner(System.in);
                            System.out.println("Select a currency by index: ");
                            final int userInput12 = scan.nextInt();

                            status.setSell(matchUserInput11[userInput12]);

                            clear.getSpace();


                        } else {                                                                // wenn es mehrere passende Währungen gibt
                            for (Currencys element1 : finalCurrency) {

                                if (element1.containsString(userInputCur2)) {                   // Methode um Currency to Sell festzusetzen,
                                    status.setSell(element1.getName());                         // falls es nur eine passende Währung gibt.
                                    clear.getSpace();
                                }
                            }
                        }
                        break;



                    case "2":
                        System.out.println("Enter an amount: ");

                        final Scanner scan21 = new Scanner(System.in);
                        final double AMOUNT = scan.nextDouble();
                        double result = status.calculationAmount(AMOUNT);
                        clear.getSpace();

                        // wir formatieren die Variablen, runden auf zwei Nachkommastellen
                        String formattedResult = String.format("%.2f", result);
                        String formattedAmount = String.format("%.2f", AMOUNT);


                        //System.out.format("Buying %s of %s", formattedAmount, buyStatus);


                        System.out.format("Buying " + formattedAmount + " of " + status.getBuy() + "\n");
                        System.out.format("Selling " + formattedResult + " of " + status.getSell() + "\n");
                        System.out.println("++++++++++++++++++++++");

                        break;



                    default:
                        clear.clearConsole();
                        condition = false;

                }

            }

    }

}


