package com.company;

class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }

    void bite(){
        System.out.println("Biting....");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}


class Human extends Monkey implements BasicAnimal{

    void speak(){
        System.out.println("Hello Sir !.....");
    }

    @Override
    public void eat() {
        System.out.println("Eating.............");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping..............");
    }
}

public class Program1 {
    public static void main(String[] args) {

        Human h1=new Human();
        h1.sleep();
    }
}
