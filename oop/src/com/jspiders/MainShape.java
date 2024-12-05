package com.jspiders;

public class MainShape {
    public static void main(String[] args) {
        Shape s1=new Shape("green",5);
        System.out.println(s1.color);

        Circle c1=new Circle();
        System.out.println(c1.color);
//        s1.color="green";
        s1.show();
        c1.show();
        s1.show();
        System.out.println(s1.num);
        c1.show();
    }
}
