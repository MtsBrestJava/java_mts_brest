package by.mts.brest.java;

public class Lesson9_class {
    public static void main(String[] args) {
      // Тип-Human  любоеИмя = СОЗДАНИЕ ОБЪЕКТА С ИМЕНЕМ "любоеИмя" от класса Human

        Human vasya = new Human();
        vasya.name = "Vasilii";
        vasya.age = 24;
        vasya.weigth = 72.5f;
        Human petya = new Human();
        petya.age = 20;

        vasya.riseAge();
        vasya.riseAge();
        vasya.riseAge();
        vasya.run();

        System.out.println("vasya.name = " + vasya.name);
        System.out.println("vasya.age = " + vasya.age + " goda");
        System.out.println("vasya.weigth = " + vasya.weigth + " kg");

        System.out.println("petya.age = " + petya.age);
    }
}
