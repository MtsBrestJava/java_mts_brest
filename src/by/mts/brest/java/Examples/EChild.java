package by.mts.brest.java.Examples;

public class EChild extends EParent {
    private String privateMethod() {
        return "Child#privateMethod";
    }

    protected String protectedMethod() {
        return "Child#protectedMethod";
    }

    public String publicMethod() {
        return "Child#publicMethod";
    }
}
