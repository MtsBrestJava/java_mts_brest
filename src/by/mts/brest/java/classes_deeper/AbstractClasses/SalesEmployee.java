package by.mts.brest.java.classes_deeper.AbstractClasses;

public class SalesEmployee extends Human {

    int someInt;

    {
        someInt = 5;
    }

    public SalesEmployee(int age) {
        super(age);
    }

    public SalesEmployee(int age, int weight, String name) {
        super(age, weight, name);
    }

    public SalesEmployee(int age, int weight, String name, int someInt) {
        super(age, weight, name);
        this.someInt = someInt;
    }

    public void someMethod222() {
        System.out.println("domeMethod222()");
    }

    @Override
    public void passCompliance() {
        // super.passCompliance();
        System.out.println("Compliance by Sales Employee...");
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "someInt=" + someInt +
                ", c=" + c +
                '}';
    }
}
