package by.mts.brest.java.classes_deeper.AbstractClasses;

public abstract class Human {

    private int age = 5;
    private int weight;
    private String name;
    public int c;

    public Human(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

    public void doTraining() {
        this.weight--;
    }

    public void someMethod() {
        //
    }

    public abstract void passCompliance();

    /*{
        //
        System.out.println("Compliance by Human?...");
    }*/

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", c=" + c +
                '}';
    }
}
