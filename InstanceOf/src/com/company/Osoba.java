package com.company;

public abstract class Osoba {

    Osoba(String imie, String naziwsko, int wiek){
        this.imie=imie;
        this.naziwsko=naziwsko;
        this.wiek=wiek;
    }
    String imie;
    String naziwsko;
    int wiek;
    abstract void przedstawSie();
}
