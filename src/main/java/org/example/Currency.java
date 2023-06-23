package org.example;

public class Currency {

    /**
     * Die Klasse Currencys beinhaltet zwei Parameter, welche für die Umrechnung einer Währung in eine andere von
     * Bedeutung ist.
     */

    private String name = "";
    private double sdr = 0.0;

    /**
     * @param name Über die Methode getName() und setName() kann der Name der Währung gesetzt und abgefragt werden.
     */

    public void setName(String name) {
        this.name = name;
    }       // das Array für die richtige Währung finden

    public String getName() {
        return name;
    }

    /**
     * @param sdr Über die Methode getSdr() und setSdr() kann der zugehörige SDR-Wert einer Währung abgespeichert werden.
     */
    public void setSdr(double sdr) {                             // den Wert für die gewünschte Währung finden
        this.sdr = sdr;
    }

    public double getSdr() {
        return sdr;
    }

    /**
     * @param userInput Bei dem Parameter "userInput" handelt es sich um den, vom User, eingegebenen String in die Konsole.
     *                  Hierbei kann die Groß- und Kleinschreibung ignoriert werden. Durch den Vergleich beider Strings muss
     *                  der User nicht zwingend die komplette Währung ausschreiben.
     * @return Gibt true zurück, falls der "userInput" und die Währung, die auf der Variabel "name" gespeichert ist,
     * die gleiche Sequenz an char values besitzen. Der Wert false wird zurückgegeben, falls es zu einer
     * NullPointerexception kommt.
     */
    public boolean containsString(String userInput) {                   // Wir sorgen dafür, dass es egal ist, ob die Eingabe des Nutzers
        try {
            String nameUp = name.toUpperCase();                     // groß oder klein geschrieben ist
            String sUp = userInput.toUpperCase();
            return nameUp.contains(sUp);
        } catch (NullPointerException ex) {
            return false;
        }


    }


}
