package by.mts.brest.java.concurrency;

import by.mts.brest.java.classes_deeper.Human;

public class ConcurrencyOne {
    public static void main(String[] args) throws InterruptedException {

        //Thread threadOne = new Thread();
        MyThread firstThread = new MyThread(1);
        MyThread2 secondThread = new MyThread2(2);
        System.out.println("Main started");
        firstThread.start();
        System.out.println("First thread runned");
        secondThread.start();
        System.out.println("Main ends");
    }
}

class MyThread extends Thread {
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
}

class MyThread2 extends Thread {
    int index;
    public MyThread2(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        for(int i = 0; i < 500; i++){
            try {
                Thread.sleep(2);
            } catch (Exception e) {}
            System.out.println("T #"+index+" i = " + i);
        }
    }
}