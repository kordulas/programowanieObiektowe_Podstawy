package dziedziczeniePotwor;

public class LordPiorunow extends Tytan {

    @Override
    public void przywolajGremlina() {
        System.out.println("Lord Piorunow przyzwal 40 gremlinow");
    }

    public LordPiorunow(double punktyZycia, int szybkosc, int punktyAtaku){
        super(punktyZycia,szybkosc,punktyAtaku);
    }

}