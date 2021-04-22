package com.company;

public class Main {

    public static void main(String[] args) {

        Czlowiek Jan = new Czlowiek("Jan");
        System.out.println(Czlowiek.liczebnosc);
        Czlowiek Jakub = new Czlowiek();
        Jakub.imie = "Jakub";
        System.out.println(Czlowiek.liczebnosc);

    }
}
