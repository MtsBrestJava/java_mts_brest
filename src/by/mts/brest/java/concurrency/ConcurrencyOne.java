package by.mts.brest.java.concurrency;

import by.mts.brest.java.classes_deeper.Human;

public class ConcurrencyOne {
    public static void main(String[] args) throws InterruptedException {

        //MyThread firstThread = new MyThread(1);
        //MyThread secondThread = new MyThread(2);
        Thread runnedFirstThread = new Thread(new MyRunner(1));
        Thread runnedSecondThread = new Thread(new MyRunner(2));
        System.out.println("Main started");
        //firstThread.start();
        runnedFirstThread.start();
        System.out.println("First thread runned");
        //secondThread.start();
        runnedSecondThread.start();
        System.out.println("Main ends");
    }
}

/*Human {fio, age, weight;}
class MtsSale extends Human, HumanClass {          // run()
    String fio
}
class MtsSale2 extends Human implements HumanInterface {   // run()
}*/

class MyRunner implements Runnable {
    int index;
    public MyRunner(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        for(int i = 0; i < 500; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T #"+index+" i = " + i);
        }
    }
}

/*class MyThread extends Thread {
    int index;
    public MyThread(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T #"+index+" i = " + i);
        }
    }
}*/
