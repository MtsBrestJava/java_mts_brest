package by.mts.brest.java.concurrency;

public class ConcurrencyTwo {

    public static int a;

    public static void main(String[] args) throws InterruptedException {

        Thread myFirstRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("myFirstRunnableThread -1: "+i);
                }
            }
        });

        myFirstRunnableThread.start();
        System.out.println("myFirstRunnableThread runned");

        Thread mySecondRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 156; i++) {
                    System.out.println("mySecondRunnableThread ##2: "+i);
                }
            }
        });
        mySecondRunnableThread.start();

        System.out.println("mySecondRunnableThread runned");
        System.out.println("End of program");
    }

}
