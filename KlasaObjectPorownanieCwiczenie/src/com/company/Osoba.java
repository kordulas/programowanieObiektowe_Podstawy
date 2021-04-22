package com.company;

public class Osoba {
    String imie;
    String nazwisko;
    int wiek;
    public Osoba(String imie, String nazwisko, int wiek){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }
    public boolean equals(Object o){
        if(this==o) return true;
        if(this.getClass() != o.getClass() || o == null) return false;
        Osoba tmp = (Osoba)o;
        System.out.println("Obiekty są sobie równe");
        return this.imie == tmp.imie && this.nazwisko == tmp.nazwisko && this.wiek == wiek;
    }
    public String toString(){
        return this.imie +" "+ this.nazwisko + " " + this.wiek;
    }
}
