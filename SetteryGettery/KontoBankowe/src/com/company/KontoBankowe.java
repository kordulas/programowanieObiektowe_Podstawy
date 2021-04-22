package com.company;

public class KontoBankowe {

    private int saldo;
    //private int kwota;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void wplac(int kwota) {
        saldo = saldo + kwota;
        System.out.println("Wpłacono " + kwota + "zł");
        System.out.println("Aktualny stan konta to: " + getSaldo() + "zł");
    }

    public void wyplac(int kwota){
        if( kwota > saldo){
            System.out.println("Niewystarczjąca ilośc środków na koncie");
        }else {
            saldo = saldo - kwota;
            System.out.println("Wypłacono: " + kwota);
            System.out.println("Aktualny stan konta to: " + getSaldo() + "zł");
        }
    }
}
