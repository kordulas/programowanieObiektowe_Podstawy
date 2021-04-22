package com.company;

public class Uczen {
    private String nazwisko;
    private int ocena;

    public String getNazwisko() {
        return "Nazwisko: " + nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko.length() >= 2){
        this.nazwisko = nazwisko;
        }else{
            System.out.println("Podano błędne nazwisko");
        }
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if( ocena >=1 && ocena <=6){
        this.ocena = ocena;
        }else{
            System.out.println("Wpisano nieprawidłową ocenę");
        }
    }
}
