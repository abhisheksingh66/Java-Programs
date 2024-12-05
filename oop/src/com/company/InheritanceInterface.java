package com.company;

interface Parent{
    void greet1();
    void greet2();

}

interface Child extends Parent{

    void greet3();
    void greet4();

}

class Mini implements Child{

    @Override
    public void greet3() {
        System.out.println("greet 1....");
    }

    @Override
    public void greet4() {
        System.out.println("greet 2....");
    }

    @Override
    public void greet1() {
        System.out.println("greet 3....");
    }

    @Override
    public void greet2() {
        System.out.println("greet 4....");
    }
}







public class InheritanceInterface {
    public static void main(String[] args) {

        Mini m1=new Mini();
        m1.greet1();
        m1.greet2();
        m1.greet3();
        m1.greet4();

    }
}
