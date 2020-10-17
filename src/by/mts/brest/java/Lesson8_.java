package by.mts.brest.java;

public class Lesson8_ {


    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int z;
        z = y + 1;
        System.out.println("z = " + z);

        int poditog, itog;
        poditog = (z * x + y)*22;
        System.out.print("poditog = " + poditog + "; ");
        itog = poditog*64 - y%2;
        System.out.println("itog = " + itog);
    }


}
