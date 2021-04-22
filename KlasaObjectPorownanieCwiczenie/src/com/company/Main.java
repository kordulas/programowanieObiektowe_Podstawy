package com.company;

public class Main {

    public static void main(String[] args) {

        Osoba[] osoby = new Osoba[2];
        osoby[0]= new Osoba("Jakub","Kordulasinski",30);
        osoby[1]= new Osoba("Jakub","Kordulasinski",30);
        System.out.println(osoby[0].equals(osoby[1]));
        System.out.println(osoby[0]);
    }
}
