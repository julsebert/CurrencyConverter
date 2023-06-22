package org.example;

public class Currencys {

    private String name = "";
    private double sdr = 0.0;


    public void setName(String name){
        this.name = name;
    }       // das Array für die richtige Währung finden

    public String getName(){
        return name;
    }

    public void setSdr(double sdr){                             // den Wert für die gewünschte Währung finden
        this.sdr = sdr;
    }

    public double getSdr() {
        return sdr;
    }

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
