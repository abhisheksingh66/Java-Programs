package com.inheritance;

public class Test {
    public static void main(String[] args) {
        Vehicals v1=new Vehicals();
        v1.start();

        TwoWheels t1=new TwoWheels();
        t1.start();
        t1.show();

        Bike b1=new Bike();
        b1.start();
        b1.show();
        b1.Gone();


    }
}
