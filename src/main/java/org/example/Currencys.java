package org.example;

public class Currencys {

    private String name = "";
    private double sdr = 0.0;

    /**
     *
     * @param name findet den Namen für die gewünschte Währung aus dem eingelesenen File
     */
    public void setName(String name){
        this.name = name;
    }       // das Array für die richtige Währung finden

    public String getName(){
        return name;
    }

    /**
     *
     * @param sdr setzt den Wert auf die gewollte SDR Währung
     */
    public void setSdr(double sdr){                             // den Wert für die gewünschte Währung finden
        this.sdr = sdr;
    }

    public double getSdr() {
        return sdr;
    }

    /**
     *
     * @param s ist der userInput, dabei wird sicher gestellt, dass trotz Groß- und Kleinschreibung der richtige Currencyname gefunden wird,
     *         indem man beide Parameter, name und s, in UPPERCASE umwandelt und dann auf ähnlichen Inhalt untersucht.
     * @return Gibt true zurück, falls s und name die gleiche Sequenz an char values besitzen. false wird zurückgegeben,
     *         falls es zu einer NullPointerexception kommt.
     */
    public boolean containsString(String s) {                   // Wir sorgen dafür, dass es egal ist, ob die Eingabe des Nutzers
        try{
            String nameUp = name.toUpperCase();                     // groß oder klein geschrieben ist
            String sUp = s.toUpperCase();
            return nameUp.contains(sUp);
        } catch(NullPointerException ex){
            return false;
        }


    }



}
