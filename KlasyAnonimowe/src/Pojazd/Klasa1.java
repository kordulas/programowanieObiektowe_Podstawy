package Pojazd;

public class Klasa1 {
    public static void main(String[] args) {
        Auto audi = new Auto();
        audi.poruszanieSie(new PoruszanieSieDoPrzodu() {
            @Override
            public void jadeDoPrzodu() {

            }
        });
    }
}
interface PoruszanieSieDoPrzodu{
    void jadeDoPrzodu();
}
class Auto{
    void poruszanieSie(PoruszanieSieDoPrzodu a){
        a.jadeDoPrzodu();
    }
}
