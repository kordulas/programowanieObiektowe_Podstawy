package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Audi: ");
        Samochod audi = new Samochod("Audi",4,4);
        audi.otworzZakmnij();
        audi.otworzZakmnij();
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("Subaru: ");
        SamochodSportowy subaru = new SamochodSportowy("Subaru",4,4);
        subaru.otworzZakmnij();
        subaru.otworzZakmnij();
    }
}
