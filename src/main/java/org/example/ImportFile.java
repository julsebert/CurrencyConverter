package org.example;
import java.io.*;
import java.util.Scanner;

public class ImportFile {

    public static B_Currencys[] importFile() {

        /**
         * <h1>Import SDR - Werte</h1>
         * Um die den Betrag leichter in eine andere Währung umzurrechnen arbeiten wir mit dem sog. SDR, kurz für
         * Sonderziehungsrechte (Special Drawing Rights). Es handelt sich hier nicht um eine eigenständige Währung,
         * sondern um eine Art Recheneinheit.
         * In der Methode importFile() wird die externe Datei mit den sdr Daten eingelesen.
         *
         */

        B_Currencys[] ArrayCur = new B_Currencys[0];

        try {
            File getCSVFiles = new File("./Projekt SE1/Tabelle23 final.csv");
            Scanner sdrData = new Scanner(getCSVFiles);

            int numbersOfCurrencys = 0;

            do {
                String A = sdrData.nextLine();
                numbersOfCurrencys++;
            } while (sdrData.hasNext());
            // Herausfinden der Anzahl an Währungen


            ArrayCur = new B_Currencys[numbersOfCurrencys];

            int count = 0;

            for (int i = 0; i < numbersOfCurrencys; i++) {

                String A = sdrData.nextLine();

                int komma = A.indexOf(',');

                B_Currencys newCurrency = new B_Currencys();
                // Erstellung eines neuen Objekts der Klasse B_Currencys

                newCurrency.setName(A.substring(0, komma));

                double toDouble = Double.parseDouble(A.substring(komma));
                newCurrency.setSdr(toDouble);

                ArrayCur[count] = newCurrency;
                count++;
            }

            sdrData.close();

        } catch (IOException ioe) {
            System.out.println("This file cannot be reached");
        }

        return ArrayCur;
    }

}

