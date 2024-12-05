package com.jspiders;

import java.awt.font.FontRenderContext;

class DemoThread extends Thread{
    public void run(){
        for (int i = 1;i<5;i++){
            System.out.println("Demo  Therad.................");
        }

    }
}



public class Program1 {
    public static void main(String[] args) {
        System.out.println("Program started....");
        DemoThread d1=new DemoThread();
        d1.run();
        for(int i=1;i<5;i++){
            System.out.println("MainThread........");
        }
        System.out.println("Program Ends");

    }
}
