package com.jspiders;

public class Circle extends Shape {
    void show(){
      triangle t1=new triangle();
      t1.play(this);
        super.show();
        System.out.println("Circle is showing");
        super.game();
        System.out.println(color + " " + num);
    }

    Circle(){
      super("red",22);
    }
}

class triangle{
    void play(Circle circle){
        System.out.println(circle.color + " showing Traingle");
    }
}
