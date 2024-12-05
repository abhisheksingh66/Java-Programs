package com.Shradha;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile =new File("testfile.text");

        if (myFile.createNewFile()){
            System.out.println("created");
        }else {
            System.out.println("Already created");
        }
    }
}
