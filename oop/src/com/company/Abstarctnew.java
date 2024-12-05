package com.company;

abstract class Base2{
    public Base2() {
        System.out.println("Base2 Constructor...");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}

class child extends Base2{

    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }

    @Override
    public void greet1() {
        System.out.println("Good Evening !");
    }
}

abstract class child2 extends Base2{

    public void msg(){
        System.out.println("I am Good !");
    }


}









public class Abstarctnew {
    public static void main(String[] args) {

    }
}
