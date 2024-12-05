package com.asoiders.oops;

class Greet{

    void greeting(){
        System.out.println("Hi good morning");
    }

    void greeting(String name){
        System.out.println("Hi good morning " + name);
    }

    void greeting(String name,int count){
        for (int i=0;i<=count;i++){
            System.out.println(" Hi good morning " + name + count);
        }

    }
}
public class hello {
    public static void main(String[] args) {
        Greet g1=new Greet();
        g1.greeting();
        g1.greeting("abhishek");
        g1.greeting("anshul" ,2);

    }
}
