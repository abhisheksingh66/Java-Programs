package com.Shradha;

public class Exception extends Throwable {
    static void checkage() throws ArithmeticException{
        System.out.println(18/0);
    }
    public static void main(String[] args) {
//       int age=10;
        try {
            checkage();
        } catch (ArithmeticException error) {
            System.out.println("Caught an exception: " + error);
        }
        System.out.println("Hello java !");
    }

}
