package com.Interface;

interface car{

    void start();

   default void stop(){

 }

        }

class Bike implements car{

    @Override
    public void start() {
        System.out.println("my bike is startiing");
    }
}

public class interfaces {
    public static void main(String[] args) {

    }
}
