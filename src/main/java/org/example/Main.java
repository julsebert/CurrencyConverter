package org.example;
import java.util.Scanner;
public class Main {

    /**
     * import java.util.Scanner
     * Definition sout
     * @param args
     */
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Currency to buy: ");
        System.out.println("Currency to sell: ");
        System.out.println("++++++++++++++++++++++");
        System.out.println("0: Select currency to buy");
        System.out.println("1: Select currency to sell");
        System.out.println("2: Chose amount to be converted:");
        System.out.println("Please chose an option (<<x>> to exit): ");
        System.out.println("Please chose an option (<<x>> to exit): ");


        /**
         * @param userInput
         */

        final String userInput = scan.next();
                System.out.print(userInput);

    }
}
