package com.company;

public class MetodyCwiczenia5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(dodaj(a,b));
        int wynik =  dodaj(5,7);
        System.out.println(wynik);
    }
    static int dodaj(int a, int b){
        return a + b;
    }
}
