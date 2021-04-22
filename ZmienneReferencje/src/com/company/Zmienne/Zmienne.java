package com.company.Zmienne;

public class Zmienne {
    public static void main(String[] args) {

        int a = 20;
        zmienWartoscPrymitywna(a);
        System.out.println(a);

        Liczba obiektLiczba = new Liczba();
        obiektLiczba.liczba = 20;
        zmienWartoscObiektowa(obiektLiczba);
        System.out.println(obiektLiczba.liczba);
    }
    public static void zmienWartoscPrymitywna(int liczba){
        liczba = -1;
    }
    public static void zmienWartoscObiektowa(Liczba obiektLiczba){
        obiektLiczba.liczba = -1;
    }
}
