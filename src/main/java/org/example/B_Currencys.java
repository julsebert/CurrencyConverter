package org.example;

public class B_Currencys {

    private String name = "";
    private double sdr = 0.0;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public void setSdr(double sdr){
        this.sdr = sdr;
    }

    public double getSdr() {
        return sdr;
    }

    public boolean containsString(String s) {           // Wir sorgen dafür, dass es egal ist ob die Eigabe des Nutzers
        String nameUp = name.toUpperCase();             // Groß oder klein geschrieben ist
        String sUp = s.toUpperCase();
        return nameUp.contains(sUp);

    }



}
