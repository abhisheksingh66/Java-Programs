package com.Shradha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File fileObj=new File("orange.txt");
            Scanner input =new Scanner(fileObj);
            while(input.hasNextLine()){
                String data=input.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("some error" +e);
        }
    }
}
