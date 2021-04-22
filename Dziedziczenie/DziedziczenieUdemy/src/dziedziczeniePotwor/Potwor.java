package dziedziczeniePotwor;

public class Potwor {
    private double punktyZycia;
    private int szybkosc;
    private int punktyAtaku;

    Potwor(double punktyZycia, int szybkosc, int punktyAtaku){
        this.punktyZycia=punktyZycia;
        this.szybkosc=szybkosc;
        this.punktyAtaku=punktyAtaku;
    }
    public void atakuj(){
        System.out.println("Metoda atakuj z klasy potwor");
        System.out.println("Wybrane stworzenie zaatakowalo");
    }

    public double getPunktyZycia() {
        return punktyZycia;
    }

    public void setPunktyZycia(double punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    public int getSzybkosc() {
        return szybkosc;
    }

    public void setSzybkosc(int szybkosc) {
        this.szybkosc = szybkosc;
    }

    public int getPunktyAtaku() {
        return punktyAtaku;
    }

    public void setPunktyAtaku(int punktyAtaku) {
        this.punktyAtaku = punktyAtaku;
    }
}
