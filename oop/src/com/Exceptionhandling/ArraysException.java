package com.Exceptionhandling;

import java.util.Scanner;

public class ArraysException {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=78;
        arr[1]=54;
        arr[2]=38;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array index");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to divide the value  with");
        int num= sc.nextInt();

        try {
            System.out.println("The value at array index entered is : " +arr[ind] );
            System.out.println("The value of array-value/number is : " +arr[ind]/num );
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException Occuredd ! " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException0 Occuredd ! " + e);
        }catch (Exception e){
            System.out.println("Some Exception Occuredd ! " + e);
        }

    }
}
