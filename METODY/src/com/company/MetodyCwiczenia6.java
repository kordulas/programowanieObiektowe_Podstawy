package com.company;

public class MetodyCwiczenia6 {
    public static void main(String[] args) {
        System.out.println(dodaj(1));
        System.out.println(dodaj(1, 2));
        System.out.println(dodaj(1 + 2));

    }
    static int dodaj(int x){
        return ++x;
    }
    static int dodaj(int x, int y){
        return ++x + ++y;
    }
}
