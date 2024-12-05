package com.company;

class MyThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Thread one");
            System.out.println("I am happy");
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Thread Two");
            System.out.println("I am sad");
        }
    }
}


public class ThreadsOne {
    public static void main(String[] args) {

        MyThread t1=new MyThread();
        MyThread1 t2=new MyThread1();
        t1.start();
        t2.start();
    }
}
