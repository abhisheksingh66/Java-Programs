package com.basics;

class Person{

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }

    String name;
    int age;

    void walk(){
        System.out.println(name + " person is walking");
    }

}

class Developer extends Person{


    public Developer(String name, int age) {
        super(name, age);
    }

    void walk(){
        System.out.println(name + " developer is walking");
    }
}

public class Mianclass {
    public static void main(String[] args) {
        Person p1=new Person("abhishek",22);
        p1.walk();

        Developer d1=new Developer("anshul",24);
        d1.walk();
    }
}
