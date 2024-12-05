package com.company;

abstract class Base1{
    public Base1() {
        System.out.println("Base class Constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void great();
    abstract public void great2();
}

class Child2 extends Base1{

    @Override
    public void great() {
        System.out.println("Good Morning");
    }

    @Override
    public void great2() {
        System.out.println("Good Evening");
    }
}

abstract class Child3 extends Base1{
    public void show(){
        System.out.println("hello showing");
    }
}


public class Abstract {
    public static void main(String[] args) {
Child2 c2=new Child2();
//Child3 c3=new Child3();
    }

}
