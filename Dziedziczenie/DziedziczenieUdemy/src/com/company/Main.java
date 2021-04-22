package com.company;
import dziedziczeniePotwor.LordPiorunow;
import dziedziczeniePotwor.Potwor;
import dziedziczeniePotwor.Smok;
import dziedziczeniePotwor.Tytan;

public class Main {

    public static void main(String[] args) {
        Potwor gigant = new Tytan(100,20,60);
        gigant.atakuj();
        Smok zielonySmok = new Smok(80,50,50);
        zielonySmok.lec();
        System.out.println(gigant.getPunktyAtaku());
        gigant.setPunktyAtaku(65);
        System.out.println(gigant.getPunktyAtaku());

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");

        Tytan tytan = new Tytan(200,40,120);
        tytan.oslepPrzeciwnika();
        //tytan.przywolajGremlina(); dzięki modyfikatorowi protected metoda nie jest dostepna
        // poza pakunkiem dziedziczeniePotwor

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");

        LordPiorunow lordPiorunow = new LordPiorunow(400,80,240);
        lordPiorunow.oslepPrzeciwnika();
        System.out.println(lordPiorunow.getPunktyZycia());
        System.out.println(lordPiorunow.getClass());
        lordPiorunow.przywolajGremlina();



    }
}
