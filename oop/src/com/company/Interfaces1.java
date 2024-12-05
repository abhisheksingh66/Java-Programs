package com.company;

interface Bicycle{
    int a=45;
    void applyBrak(int decrement);
    void speedUp(int increment);

}

interface HornBicycle{
//    int a=45;
    void blowHornpeep();
    void blowHornpoop();

}

class Avon implements Bicycle,HornBicycle{

    void blowhorn(){
        System.out.println("Applying horn");
    }

    @Override
    public void applyBrak(int decrement) {
        System.out.println("Applying break");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying Speed");
    }

    @Override
    public void blowHornpeep() {
        System.out.println("horn peep");
    }

    @Override
    public void blowHornpoop() {
        System.out.println("horn poop");
    }
}

public class Interfaces1 {
    public static void main(String[] args) {
Avon a1=new Avon();
a1.applyBrak(1);
a1.blowHornpoop();
a1.blowHornpeep();
        System.out.println(a1.a);
    }
}
