package com.company;

public class Main {

    public static void main(String[] args) {

        KontoBankowe kontoOsobiste = new KontoBankowe();
        kontoOsobiste.setSaldo(2000);
        System.out.println(kontoOsobiste.getSaldo());
        kontoOsobiste.wplac(500);
        kontoOsobiste.wyplac(3000);
        kontoOsobiste.wyplac(1500);

    }
}
