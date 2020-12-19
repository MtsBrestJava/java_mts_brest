package by.mts.brest.java.classes_deeper.Interfaces;

public class SomeClass implements SomeInterface {

    @Override
    public void methodOne() {
        System.out.println("Implemented methodOne() in SomeClass");
    }

    @Override
    public void calculateTwo() {
        System.out.println("Implemented methodTwo() in SomeClass");
    }

    @Override
    public int calc(String a, int b) {
        return 0;
    }
}
