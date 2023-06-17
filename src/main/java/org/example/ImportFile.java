package org.example;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ImportFile {

    public static B_Currencys importFile() {

        /**
         * <h1>Import SDR - Werte</h1>
         * Um die den Betrag leichter in eine andere Währung um zur rechnen arbeiten wir mit dem sog. SDR, kurz für
         * Sonderziehungsrechte (Special Drawing Rights). Es handelt sich hier nicht um eine eigenständige Währung,
         * sondern um eine Art Recheneinheit.
         * In der Methode importFile() wird die externe Datei mit den sdr Daten eingelesen.
         *
         */

        B_Currencys[] ArrayCur = new B_Currencys[0];

        try {
            File getCSVFiles = new File("src/main/resources/Tabelle23final.txt");
            Scanner sdrData = new Scanner(getCSVFiles);

            if(sdrData.hasNextLine()) {
                int count = 0;
                int count2 = 0;

                // Anzahl der Zeilen wird gezählt
                while (sdrData.hasNext()) {
                    sdrData.nextLine();
                    count++;
                }

                ArrayCur = new B_Currencys[count];
                sdrData = new Scanner(getCSVFiles);


                for (int i = 0; i < count; i++) {

                   // int komma = sdrData.next().indexOf(";");
                    String currentLine = sdrData.nextLine();
                    //System.out.println(currentLine);

                    // Trennung zwischen Name und SDR rausfinden
                    int komma = currentLine.indexOf(';');

                    B_Currencys newCurrency = new B_Currencys();
                    // Erstellung eines neuen Objekts der Klasse B_Currencys

                    newCurrency.setName(currentLine.substring(0, komma));
                    // Name der Währung rausfinden

                    String doubleWert = currentLine.substring(komma+1);
                    double zahl;
                    zahl = Double.parseDouble(doubleWert);
                    newCurrency.setSdr(zahl);
                    // String in einen double-Wert ändern

                    //System.out.println(newCurrency.getName());

                    ArrayCur[count2] = newCurrency;
                    //System.out.println("Current currency at index " + count2 + ": " + ArrayCur[count2].getName() + ArrayCur[count2].getSdr());
                    count2++;


                }

                /*for (B_Currencys element : ArrayCur) {
                    if (element.containsString("doll")) {
                        System.out.println("YES! Because name is " + element.getName());
                    } else {
                        System.out.println("NO! Because name is " + element.getName());
                    }
                }

                 */
            }

                sdrData.close();

        } catch (IOException ioe) {

        }

        return null;
    }

}

