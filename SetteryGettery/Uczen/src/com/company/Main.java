package com.company;

public class Main {

    public static void main(String[] args) {

        Uczen pierwszy = new Uczen();
        pierwszy.setNazwisko("Kordulas");
        System.out.println(pierwszy.getNazwisko());
        Uczen drugi = new Uczen();
        drugi.setNazwisko("K");
        System.out.println(drugi.getNazwisko());
        pierwszy.setOcena(6);


    }
}

