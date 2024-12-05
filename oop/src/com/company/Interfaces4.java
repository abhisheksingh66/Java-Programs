package com.company;

import javax.print.attribute.standard.JobName;

interface Bicycle1{
    int a=455;
    void applyBrake(int decremant);
    void applySpeed(int increament);



}

class Honda implements Bicycle{

    @Override
    public void applyBrak(int decrement) {
        System.out.println("Applying Brake.....");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying Speed.....");
    }


    void blowHorn(){
        System.out.println("Apply horn.......");
    }
}

public class Interfaces4 {
    public static void main(String[] args) {

        Honda h1=new Honda();
        h1.applyBrak(1);
        System.out.println(h1.a);

}

}
