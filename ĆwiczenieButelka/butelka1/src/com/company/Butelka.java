package com.company;

public class Butelka {
    Butelka(int numerButelki, double ileLitrow){
        this.numerButelki=numerButelki;
        this.ileLitrow=ileLitrow;
    }
    private double ileLitrow;
    private int numerButelki;


    public static void main(String[] args) {

        Butelka[] butelki = new Butelka[10];
        for(int i = 0; i < butelki.length; i++){
            butelki[i]= new Butelka(i,1 +i);
        }
        for(Butelka x :butelki){
            System.out.println("Butelka numer: " + x.numerButelki + " ma pojemność: " + x.ileLitrow +"l");
        }
    }
}
