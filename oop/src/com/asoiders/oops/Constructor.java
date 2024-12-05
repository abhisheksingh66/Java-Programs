package com.asoiders.oops;

class Complex{
    String name;
    int age;

    public Complex(String name){
        this.name =name;
        this.age=99;
    }

    public Complex(String name,int age){
      this.name =name;
      this.age=age;
    }

    void  print(){
        System.out.println("Hi " + name + " " + age);
    }
}


public class Constructor {
    public static void main(String[] args) {
        Complex n1=new Complex("abhishek");
        Complex n2=new Complex("Anshul",27);
        n1.print();
        n2.print();
    }
}
