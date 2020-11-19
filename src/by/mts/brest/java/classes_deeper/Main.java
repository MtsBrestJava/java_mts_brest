package by.mts.brest.java.classes_deeper;

import java.util.ArrayList;

public class Main {

    // Наша программа для создания ОБЪЕКТОВ классов и тестов с ними
    public static void main(String[] args) {

        Human abonentIgor = new Human();
        Human podryadchikPetya = new Human("Petr", "Ivanov");

        System.out.println("abonentIgor = " + abonentIgor);
        System.out.println("podryadchikPetya = " + podryadchikPetya);
        System.out.println("----------------------------------------------");


        ArrayList<mtsTech> mtsTechList = new ArrayList<>();
        mtsTechList.add(new mtsTech("Aleksandr", "Levchenko"));
        mtsTechList.add(new mtsTech("Ruslan", "Ostrovskij"));
        mtsTechList.add(new mtsTech("Sergey", "Ivaniukovich"));

        ArrayList<mtsSale> mtsSaleList = new ArrayList<>();
        mtsSaleList.add(new mtsSale("Alexey", "Ragozinskij"));
        mtsSaleList.add(new mtsSale("Vasya", "Pupkin"));

        System.out.println("mtsTechList = ");
        mtsTechList.forEach(System.out::println);
        System.out.println("mtsSaleList = ");
        mtsSaleList.forEach(System.out::println);
        System.out.println("----------------------------------------------");

    }

}
