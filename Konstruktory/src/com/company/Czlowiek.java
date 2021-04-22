package com.company;

public class Czlowiek {
    String imie;
    static int liczebnosc = 0;
    Czlowiek (String imie){
        this.imie=imie;
        liczebnosc++;
    }
    Czlowiek(){
        liczebnosc++;
    }

}
