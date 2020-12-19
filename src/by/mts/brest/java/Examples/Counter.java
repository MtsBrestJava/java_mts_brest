package by.mts.brest.java.Examples;

final class Counter {
    private static Integer total = 0;

    Integer getTotal() {
        return total;
    }

    void increaseTotal() {
        total++;
    }
}
