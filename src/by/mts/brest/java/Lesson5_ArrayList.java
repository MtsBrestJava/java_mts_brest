package by.mts.brest.java;

import java.util.ArrayList;

public class Lesson5_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> someInts = new ArrayList<Integer>();
        someInts.add(55);
        someInts.add(12);
        someInts.add(99);
        someInts.add(3, 222);
        System.out.println("someInts = " + someInts);
        someInts.set(1, 909);
        System.out.println("someInts = " + someInts);

    }
}
