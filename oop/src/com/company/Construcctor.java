package com.company;
class Cylinder{


    private double radius;
    private int height;

    public Cylinder(double radius, int height) {
        this.radius = radius;
        this.height = height;
    }

//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

   public double surfacearea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
   }
}

public class Construcctor {
    public static void main(String[] args) {
    Cylinder c1=new Cylinder(9,12);
//    c1.setHeight(12);
//    c1.setRadius(9);
//        System.out.println(c1.getHeight());
//        System.out.println(c1.getRadius());
        System.out.println(c1.surfacearea());
    }
}
