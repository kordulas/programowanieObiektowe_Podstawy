package com.company;

public class Main {

    public static void main(String[] args) {

        Zewnetrzna instancja1 = new Zewnetrzna();
        Zewnetrzna.Zagniezdzona instancja2 = instancja1.new Zagniezdzona();
        Zewnetrzna.Zagniezdzona2 instancja3 = new Zewnetrzna.Zagniezdzona2();
    }
}
class Zewnetrzna {
    Zewnetrzna()
    {
        System.out.println("Jestem z klasy zewnętrznej A");
    }
    class Zagniezdzona {
        Zagniezdzona()
        {
            System.out.println("Jestem z klasy zagnieżdzonej B");
        }
        void cos()
        {
            test = 5;

        }

        private int tmp;
    }
    private int test;


    static class Zagniezdzona2 {
        Zagniezdzona2()
        {
            System.out.println("Jestem z klasy zagnieżdzonej C");
        }
    }
    void cos2()
    {
        //  tmp = 2;
        Zagniezdzona obj = new Zagniezdzona();

    }

}