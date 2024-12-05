package com.company;



class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 1.....");
    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 2.....");
    }
}
public class MyThreadRunnable {
    public static void main(String[] args) {

        MyRunnable1 bullet1=new MyRunnable1();
        Thread gun1=new Thread(bullet1);


        MyRunnable2 bullet2=new MyRunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
