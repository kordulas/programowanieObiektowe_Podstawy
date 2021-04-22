package com.company;

public class Pracownik extends Osoba{
    Pracownik(String imie, String nazwisko, int wiek, double wynagrodzenie){
        super(imie,nazwisko,wiek);
        this.wynagrodzenie=wynagrodzenie;
    }
    double wynagrodzenie;

    @Override
    public void przedstawSie() {
        System.out.println("Mam na imie: " + imie + ", nazywam się: " + naziwsko + ", mam " + wiek +" lat. Zarabiam: "+ wynagrodzenie);
    }
    public void pracuj(){
        System.out.println("Programuje");
    }
}
