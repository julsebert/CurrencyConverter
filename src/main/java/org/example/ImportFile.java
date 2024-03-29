package org.example;

import java.io.*;
import java.util.Scanner;

public class ImportFile {

    /**
     * Import SDR - Werte
     * Um den Betrag leichter in eine andere Währung umzurechnen arbeiten wir mit dem sog. SDR, kurz für
     * Sonderziehungsrechte (Special Drawing Rights). Es handelt sich hier nicht um eine eigenständige Währung,
     * sondern um eine Art Recheneinheit.
     * In der Methode importFile() wird die externe Datei mit den sdr Daten eingelesen.
     * Dabei wird der Trennungspunkt zwischen dem Namen der Währung und dem SDR-Wert herausgefunden.
     * Name und Wert werden dann an dieser Stelle getrennt und in zwei neuen Variablen gespeichert,
     * welche letztendlich in den Setter Methoden "setSdr" und "setName" der Klasse Currencys dann festgelegt werden.
     */

    public Currency[] importFile() {

        Currency[] arrayCur = new Currency[0];

        try {
            // File getCSVFiles = new File("src/main/resources/Tabelle23final.txt");
            Scanner sdrData = new Scanner(new InputStreamReader(getClass().getResourceAsStream("/Tabelle23final.txt")));

            if (sdrData.hasNextLine()) {
                int count = 0;
                int count2 = 0;


                while (sdrData.hasNext()) {                                                 // Anzahl der Zeilen wird gezählt
                    sdrData.nextLine();
                    count++;
                }

                arrayCur = new Currency[count];
                sdrData = new Scanner(new InputStreamReader(getClass().getResourceAsStream("/Tabelle23final.txt")));


                for (int i = 0; i < count; i++) {

                    String currentLine = sdrData.nextLine();

                    int komma = currentLine.indexOf(';');                                   // Trennung zwischen Name und SDR rausfinden

                    Currency newCurrency = new Currency();                            // Erstellung eines neuen Objekts der Klasse Currencys

                    newCurrency.setName(currentLine.substring(0, komma));                   // Name der Währung rausfinden

                    String doubleWert = currentLine.substring(komma + 1);           // String in einen double-Wert ändern
                    double zahl;
                    zahl = Double.parseDouble(doubleWert);
                    newCurrency.setSdr(zahl);

                    arrayCur[count2] = newCurrency;
                    count2++;

                }

            }
            sdrData.close();

        } catch (Exception e) {
            System.err.println("This File is not available");
        }

        return arrayCur;
    }

}

