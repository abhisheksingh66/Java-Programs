package com.company;

class home{
    public int x=22;
    protected int y=45;
    int z=6;
    private int a=78;

    public void Meth1(){
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(a);
    }
}



public class AccesModifires {
    public static void main(String[] args) {
     home h1=new home();
     h1.Meth1();

        System.out.println(h1.x);
        System.out.println(h1.y);
        System.out.println(h1.z);
//        System.out.println(h1.a);
    }
}
