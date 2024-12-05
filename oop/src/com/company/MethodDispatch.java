package com.company;

class Phone{

    public void Greet(){
        System.out.println("Good Morning");
    }

public void show(){
    System.out.println("i am show of One");
}

}


class SmartPhone extends Phone{

    public void Display(){
        System.out.println("I am Display of one");
    }


public void show(){
    System.out.println("I am show 1 of Two");
    }
}


public class MethodDispatch {
    public static void main(String[] args) {

//        Phone o1=new Phone();
//        o1.show();

        Phone p1=new SmartPhone();
        p1.show();
//        p1.Display();
p1.Greet();

    }
}
