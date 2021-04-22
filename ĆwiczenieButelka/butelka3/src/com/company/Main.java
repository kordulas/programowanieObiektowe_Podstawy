package com.company;

public class Main {


    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[3];
        butelka[0] = new Butelka(5,2,3);
        butelka[1] = new Butelka(7,5,2);
        butelka[2] = new Butelka(9,4,5);
        butelka[2].wylej(2);
        System.out.println(butelka[2].getIleLitrow());

        System.out.println("-------------");
        System.out.println("-------------");

        Butelka.przelej(1,butelka[0],butelka[1]);
        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());

        System.out.println("--------------");
        System.out.println("--------------");

        System.out.println(butelka[0].getIleLitrow());
        butelka[0].wlej(10);
        System.out.println(butelka[0].getIleLitrow());

        System.out.println("--------------");
        System.out.println("--------------");

        System.out.println(butelka[1].getIleLitrow());
        Butelka.przelej(2,butelka[0],butelka[1]);
        System.out.println(butelka[1].getIleLitrow());


    }
}

