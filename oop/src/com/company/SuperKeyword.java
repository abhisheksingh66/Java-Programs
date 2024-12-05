package com.company;
class Demo{
    int a;

    public Demo(int a) {
        this.a = a;
//        System.out.println("Demo1 comstructor");
    }

    public int getA() {
        return a;
    }

    public int show(){
        return 1;
   }

}

class Demo2 extends Demo{

    public Demo2(int a) {
        super(a);
        System.out.println("Demo2 constructor");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
Demo d1=new Demo(5);
Demo2 d2=new Demo2(55);


//        System.out.println(d1.getA());
    }
}
