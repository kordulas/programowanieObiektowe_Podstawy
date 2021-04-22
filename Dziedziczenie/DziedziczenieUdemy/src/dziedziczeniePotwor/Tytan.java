package dziedziczeniePotwor;

public class Tytan extends Potwor {

    public Tytan(double punktyZycia, int szybkosc, int punktyAtaku) {
        super(punktyZycia, szybkosc, punktyAtaku);
    }

    @Override
    public void atakuj() {
        super.atakuj();
        System.out.println("To jest dodatkowa metoda ataku z klasy Tytan");
    }

    public void oslepPrzeciwnika(){
        System.out.println("Oślepiono przeciwnika");
    }

    protected void przywolajGremlina(){
        System.out.println("Gigant przywołał 10 Gremlinow");
    }
}
