package com.Exceptionhandling;

public class ErrorDemo {
    public static void main(String[] args) {
      int a=60000;
      int b=0;

      try{
          int c=a/b;
          System.out.println(c);
      }catch (Exception e){
          System.out.println("some error " + e);
      }

        System.out.println("ending.........");
    }
}
