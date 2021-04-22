package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.dajGlos();
        BurekKot burekKot = new BurekKot();
        burekKot.dajGlos();
        burekKot.idz();
        Animal szarik = new Dog();
        ((Dog)szarik).idz();




    }
}
