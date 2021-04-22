package com.company;

public class Main {

    public static void main(String[] args) {

   WywolanieAkcji a = new WywolanieAkcji() {
        @Override
        public void akcja() {
            System.out.println("To jest klasa anonimowa");
        }
   };
    Przycisk pierwszy = new Przycisk();
    pierwszy.dodajAkcje(a);
   // pierwszy.dodajAkcje(new WywolanieAkcji() {
      //  @Override
      //  public void akcja() {
          //  System.out.println("To jest klasa anonimowa");
        //}
 //   });


    }
}
interface WywolanieAkcji{
    void akcja();
}
class Przycisk{
    void dodajAkcje(WywolanieAkcji a){
        a.akcja();
    }
}