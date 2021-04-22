package com.company;

public class Samochod extends Pojazd {
    public Samochod(String marka, int iloscKol, int iloscDrzwi){
        super(marka,iloscKol);
        this.iloscDrzwi=iloscDrzwi;
        System.out.println("To jest konstruktor klasy Samochod");
    }
    int iloscDrzwi;
    private boolean otwarty = true;
    public void otworzZakmnij(){
        otwarty = !otwarty;
        System.out.println((otwarty) ? "Samochod otwarty" : "Samochod zamkniety");
    }

    @Override
    protected void odpal() {

    }
}
