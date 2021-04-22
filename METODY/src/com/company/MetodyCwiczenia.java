package com.company;

public class MetodyCwiczenia {

    public static void main(String[] args) {

       dodaj(4,5);
       dodaj(5,6,7);

       // tutaj tylko cwiczenie dla utrwalenia sumy zmiennych z tablicy
       int[] tab1 = {3,4,5,6,7,8};
       int suma = 0;
       for(int i = 0; i < tab1.length;i++){
           suma = suma + tab1[i];
       }
        System.out.println(suma);

    }
    static void dodaj(int a,int b){
        // int wynik = a+b;
        // System.out.println(wynik);
        System.out.println(a+b);
    }
    static void dodaj(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
