package com.company;

class A{
   public int a;

    public void show1(){
        System.out.println("I am show 1 of class A");
    }

}

class B extends A{
    public void show1(){
        System.out.println("I am show 1 of class B");
    }

}

public class Overriding {
    public static void main(String[] args) {
        A a1=new A();
        a1.show1();

        B b1=new B();
        b1.show1();
    }
}
