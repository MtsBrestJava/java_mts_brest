package by.mts.brest.java;

import java.util.ArrayList;

public class Lesson5_ArrayList {
    public static void main(String[] args) {

        // Список<типДанных> ИмяСписка = new Список<типДанных>()
        ArrayList<Integer> someInts = new ArrayList<Integer>(); //1мерн
        ArrayList<ArrayList<Integer>> someInts2 = new ArrayList<ArrayList<Integer>>(); //2мерн

        someInts.add(55);
        someInts.add(12);
        someInts.add(99);
        System.out.println("someInts = " + someInts);
        someInts.add(1, 222);
        System.out.println("someInts = " + someInts);
        someInts.set(1, 909);
        System.out.println("someInts = " + someInts);
        someInts.remove(1);
        System.out.println("someInts = " + someInts);
        

    }
}
