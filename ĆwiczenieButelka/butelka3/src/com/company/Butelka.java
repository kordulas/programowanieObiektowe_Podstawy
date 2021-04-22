package com.company;

import java.util.Scanner;

public class Butelka {
    Butelka(double pojemnosc, double jakaIloscWSrodku,double ileMiejscaZostalo){
        this.pojemnosc = pojemnosc;
        this.jakaIloscWSrodku = jakaIloscWSrodku;
        this.ileMiejscaZostalo = ileMiejscaZostalo;
    }
    private double pojemnosc;
    private double jakaIloscWSrodku;
    private double ileMiejscaZostalo = pojemnosc - jakaIloscWSrodku;
    Scanner skanuj = new Scanner(System.in);

    public double getIleLitrow() {
        return jakaIloscWSrodku;
    }
    void wlej(double ile){
        if(ile > ileMiejscaZostalo){
            System.out.println("Za dużo cieczy do wlania, można dolać tylko: " + (ileMiejscaZostalo));
            System.out.println("Czy chcesz przelać pozostałą do zapełnienia ilość? ");
            System.out.println("Wpisz Tak lub Nie: ");
            String wybor = skanuj.next();
            if(wybor.toLowerCase().equals("tak")){
                double pozostalo = ile -(ileMiejscaZostalo);
                System.out.println("Dolano do pełna, pozostało: " + pozostalo);
                jakaIloscWSrodku += (ile - pozostalo);
            }else{
                System.out.println("Nie dolano cieczy");
            }
        }
    }
    void wylej(double ile){
        if(ile > jakaIloscWSrodku){
            System.out.println("Za mało cieczy w środku, nic nie wylano");
        }else
        {
            System.out.println("Wylano: " + ile + " W butelce pozostało: " + (jakaIloscWSrodku - ile));
            jakaIloscWSrodku -= ile;
        }
    }
    static void przelej (double ile, Butelka skadPrzelac, Butelka dokadPrzelac){
        if(ile > skadPrzelac.jakaIloscWSrodku){
            System.out.println("Zbyt duża ilość do przelania");
        }else if (ile > dokadPrzelac.ileMiejscaZostalo) {
            System.out.println("Za mała butelka");
        }else {
            skadPrzelac.jakaIloscWSrodku -= ile;
            skadPrzelac.ileMiejscaZostalo += ile;
            dokadPrzelac.jakaIloscWSrodku += ile;
            dokadPrzelac.ileMiejscaZostalo -= ile;

        }
    }

}


