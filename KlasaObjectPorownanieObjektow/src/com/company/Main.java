package com.company;

public class Main {

    public static void main(String[] args) {

        Punkt p1 = new Punkt(4,5);
        Punkt p2 = new Punkt(4,5);

        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
    }
}
