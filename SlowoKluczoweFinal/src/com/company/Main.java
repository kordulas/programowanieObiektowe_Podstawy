package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik();
        System.out.println(pracownik1.dataZatrudnienia);
    }
}

abstract class Osoba{}

class Pracownik extends Osoba{

    final Date dataZatrudnienia = new Date(120,02,10);

    public Date getDataZatrudnienia() {
        return dataZatrudnienia;
    }
    
}

