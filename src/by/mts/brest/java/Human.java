package by.mts.brest.java;


public class Human {

    {
        this.weigth = 1;
    }

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
        this.age = 1;
    }

    public Human(String name, int age, float weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.weightIndex = weigth/age;
    }

    String name;
    int age;
    float weigth;
    float weightIndex;

/*    void run() {
        System.out.println("I'am running");
    }*/
    void riseAge() {
        age++;
    }
}
