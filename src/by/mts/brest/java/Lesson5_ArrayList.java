package by.mts.brest.java;

import java.util.ArrayList;

public class Lesson5_ArrayList {
    public static void main(String[] args) {

        // Список<типДанных> ИмяСписка = new Список<типДанных>()
        ArrayList<Integer> someInts = new ArrayList<Integer>(); //1мерн
        ArrayList<ArrayList<Integer>> someInts2 = new ArrayList<ArrayList<Integer>>(); //2мерн
        ArrayList<Integer> someInts3 = new ArrayList<Integer>(); //1мерн
        someInts3.add(999);
        someInts3.add(888);
        someInts3.add(777);

        someInts.add(55);
        someInts.add(12);
        someInts.add(99);
        someInts.add(null);
        someInts.add(0);
        System.out.println("someInts = " + someInts);
        someInts.add(1, 222);
        System.out.println("someInts = " + someInts);
        someInts.set(1, 909);
        System.out.println("someInts = " + someInts);
        someInts.remove(1);
        System.out.println("someInts = " + someInts);
        System.out.println("someIntsINDEXED[3] = " + someInts.get(2)); // получает 2-й элемент из списка
        System.out.println("someInts = " + someInts.indexOf(99)); // ищет первое совпадение числа в списке (возвращает индекс в массиве)
        System.out.println("someInts = " + someInts.indexOf(999)); // не находит число, возвращает -1
        System.out.println("someInts = " + someInts.size()); // не находит число, возвращает -1


    }
}
