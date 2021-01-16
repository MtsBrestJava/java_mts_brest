package by.mts.brest.java.concurrency;

public class VolatileTest {

    private int bla = 5;

    private static volatile int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            for(int i = 0; i <= 1000; i++) {
                //MY_INT++;
                MY_INT = MY_INT + 1;
                // 1 MY_INT GET
                // 2 MY_INT + 1
                // 3 MY_INT = RESULT
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {
            for(int i = 0; i <= 1000; i++) {
                //MY_INT++;
                MY_INT = MY_INT + 1;
                // 1 MY_INT GET
                // 2 MY_INT + 1
                // 3 MY_INT = RESULT
            }
        }
    }
}
