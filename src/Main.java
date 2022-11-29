public class Main {
    public static void main(String[] args) {

        Test first = new Test();
        first.wypisz();

        int wynikDodawania;
        wynikDodawania = first.dodaj(44, 431);
        System.out.println(wynikDodawania);

        double wynikDzielenia = first.dzielenie(89, 0);
        System.out.println(wynikDzielenia);



    }
}

    class Test {

    void wypisz() {
        System.out.println("Jestem metoda testowa");
    }
    int dodaj(int a, int b) {
        return a + b;
    }
    double dzielenie(double x, double y){
        if (y == 0){
            return 0;
        }
        return x / y;
    }
    }