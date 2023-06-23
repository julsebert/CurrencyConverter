package org.example;

public class Interface {

    /**
     * Die Klasse Interface sorgt dafür, dass das Programm übersichtlicher wirkt und für den User lesbarer ist.
     *
     * Methode 1 "clearConsole":
     * Diese Methode ist dazu da, die Konsole zu "bereinigen", durch den Output mehrerer leeren Zeilen.
     *
     * Methode 2 "getSpace":
     * Diese Methode ist dazu da, dem Layout zusätzlichen Abstand zwischen den einzelnen Ausführungen zu geben.
     */

    public void clearConsole(){

            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

    }

    public void getSpace(){

        for (int i = 0; i < 6; i++) {
            System.out.println();
        }

    }

}
