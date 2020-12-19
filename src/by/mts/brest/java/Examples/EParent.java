package by.mts.brest.java.Examples;

public class EParent {
    String visibilityTest() {
        return privateMethod() + " " + protectedMethod() + " " + publicMethod();
    }

    private String privateMethod() {
        return "Parent#privateMethod";
    }

    protected String protectedMethod() {
        return "Parent#protectedMethod";
    }

    public String publicMethod() {
        return "Parent#publicMethod";
    }
}
