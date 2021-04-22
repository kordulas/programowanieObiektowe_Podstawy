package com.company;

import java.util.Scanner;

public class MetodyCwiczenia4 {
    public static void main(String[] args) {
        //String a = "asd";
        System.out.println("Podaj wyraz który chcesz dopisać");
        Scanner skanuj = new Scanner(System.in);
        String wpisz = skanuj.next();
        dodajDoStringa(wpisz);
    }
    static void dodajDoStringa(String wpisz){
        System.out.println("asd".concat(" " + wpisz));
    }
}
