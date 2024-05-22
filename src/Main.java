public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("___Pirma___");
        duInt(1, 6);
        System.out.println("___Antra___");
        System.out.println(PISq());
        System.out.println("___Trecia___");
        System.out.println(Math.round(Kintamieji(2, 2)));
        System.out.println("___Ketvirta___");
        int[] skaiciai = {2, 4, 5, 6};
        DuKintamieji(skaiciai);
        System.out.println("___Penkta___");
        Skaicius(10, 20);
        System.out.println(Skaicius(10, 20));



    }
///   Pirma uzduotis.

    public static void duInt(int a, int b) {
        System.out.println(a + b);
    }
///   Antra uzduotis.

    public static double PISq() {
        return 9.8596;
    }

///   Trecia uzduotis.

    public static double Kintamieji(int a, int b) {
        return (a * b);
    }

///   Ketvirta uzduotis.


    public static void DuKintamieji(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        }

///   Penkta uzduotis.



    public static int Skaicius(int min, int max) {
        return (int) (max + (Math.random() * (max - min) - min));




///   Sesta uzduotis.








































    }
}


