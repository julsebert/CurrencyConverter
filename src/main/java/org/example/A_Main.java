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
    /*public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Currency to buy: ");
        System.out.println("Currency to sell: ");
        System.out.println("++++++++++++++++++++++");
        System.out.println("0: Select currency to buy");
        System.out.println("1: Select currency to sell");
        System.out.println("2: Chose amount to be converted:");
        System.out.println("Please chose an option (<<x>> to exit): ");
           */

        /**
         * @param userInput
         */
         /*
        final String userInput = scan.next();
        System.out.print(userInput);
        final C_Interface clear = new C_Interface();

        switch (userInput) {
            case "0":
                System.out.println("Enter a currency's name or part of it (>>x<< to exit): ");
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
        */

    public static void main(String[] args) {
        try {
            File getCSVFiles = new File("./Projekt SE1/Tabelle23 final.csv");
            Scanner sc = new Scanner(getCSVFiles);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                System.out.print(sc.next() + "|");
            }
            sc.close();
        } catch(IOException ioe) {
            System.out.println("This file cannot be reached");
        }





    }
}


