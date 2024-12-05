package com.company;

import java.awt.image.SampleModel;

class Base{
    int x;

    public Base() {
        System.out.println("base constructor");
    }

    public Base(int a) {
        System.out.println("base overloaded constructor " + a);
    }

}


class Derived extends Base{
    int y;

    public Derived() {
//        super(22);
        System.out.println("Derived constructor");
    }

    public Derived(int a,int b) {
        super(a);
        System.out.println("derived overloaded constructor " + b);
    }
}

class Small extends Derived{
    public Small() {
        System.out.println("small constructor");
    }

//    public Small(int a,int b,int c){
//        super(a,b);
//        System.out.println("Small overloaded constructor " + c);
//    }

    public Small(int a,int b,int c) {
        super(a,b);
        System.out.println("Small overloaded constructor " + c);
    }

}

public class InheritConst {
    public static void main(String[] args) {
        System.out.println("Main method");
//        Base b=new Base();
//        Derived d=new Derived();
//        Derived d1=new Derived(44,55);

        Small s1=new Small(777,888,556);

    }
}
