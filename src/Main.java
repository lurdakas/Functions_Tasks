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
        System.out.println("___Sesta___");
        int[] RndmSk = RandomSkaiciai(2, 5, 5);
        System.out.println(RndmSk);
        System.out.println("___Septinta___");
        System.out.println("Suma " + MasyvoSuma(RandomSkaiciai(2, 5, 5)));
        System.out.println("___Astunta___");
        System.out.println("Vidurkis " + MasyvoVidurkis(RandomSkaiciai(2, 5, 5)));
        System.out.println("___Devinta___");
        Staciakampis(25, 25);
        System.out.println("___Desimta___");
        PrintCSS("Šiandien labai graži diena");


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
        return (int) (Math.random() * (max - min) + min);

    }


///   Sesta uzduotis.


    public static int[] RandomSkaiciai(int min1, int max1, int length) {
        int[] RndmSk = new int[length];
        for (int i = 0; i < length; i++) {
            RndmSk[i] = (int) (Math.random() * (max1 - min1) + min1);
            System.out.println(RndmSk[i]);
        }
        return RndmSk;
    }

///   Septinta uzduotis.


    public static int MasyvoSuma(int[] RndmSk) {
        int sum = 0;
        for (int i = 0; i < RndmSk.length; i++) {
            sum += RndmSk[i];
        }
        return sum;
    }


///   Astunta uzduotis.


    public static double MasyvoVidurkis(int[] arr) {
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        return average / arr.length;
    }


///   Devinta uzduotis.

    public static void Staciakampis(int vid, int is) {
        for (int i = 1; i < 25; i++) {
            for (int a = 1; a < 25; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

///   Desimta uzduotis.

    public static void PrintCSS(String text) {
        System.out.println("tarpu yra " + (text.length() - text.replace(" ", "").length() + ", simboliu " + text.replace(" ", "").length()));

























    }

}


