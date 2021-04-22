package com.company;

public class MetodyCwiczenia8 {
    public static void main(String[] args) {

        Klient a = new Klient("Jakub");
        Klient b = new Klient("Monika");
        Klient c = new Klient("Angela");
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        System.out.println(Klient.nextxId);
    }
}
class Klient {
    int id = 0;
    static int nextxId = 0;
    String imie;
    Klient( String imie){
        this.imie = imie;
        id += nextxId;
        nextxId ++;
    }
}