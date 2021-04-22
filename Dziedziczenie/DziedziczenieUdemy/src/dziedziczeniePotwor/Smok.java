package dziedziczeniePotwor;

public class Smok extends Potwor {
    public Smok(double punktyZycia,int szybkosc,int punktyAtaku){
        super(punktyZycia, szybkosc, punktyAtaku);
    }
    public void lec() {
        System.out.println("Smok poderwal sie do lotu");
        System.out.println("To jest metoda z klasy Smok");
    }

    @Override
    public void atakuj() {
        super.atakuj();
        System.out.println("To jest dodatkowa metoda z klasy smok");
    }
}