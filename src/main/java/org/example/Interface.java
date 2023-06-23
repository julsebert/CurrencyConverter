package org.example;

public class Interface {

    /**
     * Die Klasse Interface sorgt dafür, dass das Programm übersichtlicher wirkt und für den User lesbarer ist.
     *
     * Methode "getSpace()"
     * Diese Methode ist dazu da, dem Layout zusätzlichen Abstand zwischen den einzelnen Ausführungen zu geben.
     * @param lines Die Anzahl an leeren Zeilen können flexibel gewählt werden.
     */

    public void getSpace(int lines){

            for (int i = 0; i < lines; i++) {
                System.out.println();
            }

    }

}
