package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        Testowa test = new Testowa();
        int b = test.zmienWartosc(a);
        System.out.println(b);
        System.out.println(test.zmienWartosc(a));
    }
}

class Testowa{
    int zmienWartosc(int zm){
        return zm + 2;
    }
}