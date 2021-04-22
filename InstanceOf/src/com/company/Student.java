package com.company;

public class Student extends Osoba{
    Student(String imie, String nazwisko, int wiek){
        super(imie,nazwisko,wiek);
    }
    @Override
    public void przedstawSie() {
        System.out.println("Mam na imie: " + imie + ", nazywam się: " + naziwsko + ", mam " + wiek +" lat.");
    }
    public void uczSie(){
        System.out.println("Zaczynam sie uczyc");
    }
}
