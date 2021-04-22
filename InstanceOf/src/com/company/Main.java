package com.company;

public class Main {

    public static void main(String[] args) {

        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Jakub", "Kordulas", 30, 9500.00);
        osoba[1] = new Student("Anna", "Kordulas", 28);
        osoba[2] = new Pracownik("Pati", "Patowa", 25, 9500.00);
        for (Osoba czlowiek : osoba) {
            if (czlowiek instanceof Pracownik) {
                czlowiek.przedstawSie();
                ((Pracownik)czlowiek).pracuj();
            } else if (czlowiek instanceof Student){
                czlowiek.przedstawSie();
                ((Student)czlowiek).uczSie();
            }else{
                System.out.println("Nic nie dziala");
            }
        }
    }
}
