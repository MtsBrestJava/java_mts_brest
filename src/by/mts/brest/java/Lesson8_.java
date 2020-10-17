package by.mts.brest.java;

public class Lesson8_ {


    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z;
        z = y + 1;
        System.out.println("z = " + z);

        // Vvod dannyh ili chtenie fajla
        // *****

        // !!!! Obrabotka i itog #1
/*        int poditog, itog;
        poditog = (z * x + y)*22;
        System.out.print("poditog = " + poditog + "; ");
        itog = poditog*64 - y%2;
        System.out.println("itog = " + itog);*/

        // !!!! Obrabotka i itog #2
        // --/--

        // !!!! Obrabotka i itog #3 с другими данными
        // --/--

    }

    int calculateItog(int z, int x, int y) {
        int poditog, itog;
        poditog = (z * x + y)*22;
        System.out.print("poditog = " + poditog + "; ");
        itog = poditog*64 - y%2;
        System.out.println("itog = " + itog);
    }

    void




}
