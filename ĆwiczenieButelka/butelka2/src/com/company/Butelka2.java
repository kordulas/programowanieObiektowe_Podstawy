package com.company;

public class Butelka2 {
    Butelka2(double ileLitrow){
        this.ileLitrow=ileLitrow;
    }
    private double ileLitrow;

    public double getIleLitrow() {
        return ileLitrow;
    }
    void wlej(double ile) {
        if (ile < ileLitrow) {
            ileLitrow += ile;
            System.out.println("Dolano: " + ile + "l." + " Aktulany stan to: " + getIleLitrow() );
        } else {
            System.out.println("Zbyt mała pojemność butelki");
        }
    }
    void wylej(double ile){
            if(ile > ileLitrow){
                System.out.println("Zbyt mala pojemnosc butelki");
            }else{
                ileLitrow -= ile;
                System.out.println("Wylano: " + ile + "l. " + " Pozostało: " + getIleLitrow());
            }
        }
    static void przelej(double ile, Butelka2 skadPrzelac,Butelka2 dokadPrzelac){
        if( ile > skadPrzelac.getIleLitrow()){
            System.out.println("Zbyt duża ilość do przelania");
        }else if(ile < skadPrzelac.getIleLitrow() && ile > dokadPrzelac.getIleLitrow()){
            System.out.println("Za mała butelka");
        }else{
            skadPrzelac.ileLitrow -= ile;
            dokadPrzelac.ileLitrow += ile;
        }
    }

    public static void main(String[] args) {
	    Butelka2[] butelki = new Butelka2[3];
	    butelki[0] = new Butelka2(2);
	    butelki[1] = new Butelka2(4);
	    butelki[2] = new Butelka2(6);
	    butelki[0].wlej(1.5);
        System.out.println(butelki[0].getIleLitrow());
        System.out.println(butelki[1].getIleLitrow());
        System.out.println(butelki[2].getIleLitrow());
        butelki[0].wylej(1);

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println();

        butelki[2].przelej(1,butelki[2],butelki[0]);
        System.out.println(butelki[0].getIleLitrow());
        System.out.println(butelki[2].getIleLitrow());

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println();

        przelej(2,butelki[1],butelki[0]);
        System.out.println(butelki[0].getIleLitrow());
        System.out.println(butelki[1].getIleLitrow());
        przelej(6,butelki[1],butelki[2]);
        System.out.println(butelki[2].getIleLitrow());
    }
}
