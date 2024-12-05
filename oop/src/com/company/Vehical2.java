package com.company;

abstract class Vehicals{

abstract void start();

void stop(){
    System.out.println("stoping........");
    }
}

class Bike extends Vehicals{

    @Override
    void start() {
        System.out.println("Bike Starting.........");
    }
}









public class Vehical2 {
    public static void main(String[] args) {
Bike b1=new Bike();
b1.start();
b1.stop();
    }
}
