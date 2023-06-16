package org.example;
import java.io.*;
import java.util.Scanner;

public class ImportFile {

    public void importFile() {
        try {
            File getCSVFiles = new File("./Projekt SE1/Tabelle23 final.csv");
            Scanner sdrData = new Scanner(getCSVFiles);

            int numbersOfCurrencys = 38;

            for (int i = 0; i < numbersOfCurrencys; i++){
                String A = sdrData.nextLine();
                // Zeile für Zeile einlesen und dann in Arrays speichern
            }

            /*sc.useDelimiter(";");
            while (sc.hasNext()) {
                System.out.print(sc.next() + "|");
            }

             */
            sdrData.close();
        } catch (IOException ioe) {
            System.out.println("This file cannot be reached");
        }
    }

}

