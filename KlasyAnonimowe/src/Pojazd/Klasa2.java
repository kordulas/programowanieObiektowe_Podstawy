package Pojazd;

public class Klasa2 {
    public static void main(String[] args) {
        Klasa2 telewizor = new Klasa2();
        telewizor.nacisnijPrzycisk(new ZachowaniePoWlaczeniu() {
           @Override
           public void wlacz() {
               System.out.println("Telewizor wlaczony");
               System.out.println("Zachowanie z klasy anonimowej");
           }
       });
       telewizor.nacisnijPrzycisk2(new ZachowaniePoWylaczeniu() {
           @Override
           public void wylacz() {
               System.out.println("Telewizor wylaczony");
               System.out.println("Zachowanie z klasy anonimowej 2");
           }
       });
    }
    void nacisnijPrzycisk(ZachowaniePoWlaczeniu a){
        a.wlacz();
    }
    void nacisnijPrzycisk2(ZachowaniePoWylaczeniu b){
        b.wylacz();
    }
}
interface ZachowaniePoWlaczeniu{
    void wlacz();
    }
interface ZachowaniePoWylaczeniu{
    void wylacz();
}
