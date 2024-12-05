package com.jspiders;

public class Shape {
    String color;
    int num;

    void show(){
        System.out.println("shape is showing");
    }

    void game(){
        System.out.println("game is going on");
    }


    Shape(String color ,int num){
        this.color=color;
        this.num=num;
}
}
