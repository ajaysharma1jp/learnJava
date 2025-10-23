package io_Streams_codes;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        // to create file
//        File myFile = new File("file1.txt");
//        try{
//            myFile.createNewFile();
//        }catch (IOException e){
//            System.out.println("Unable to create this file!");
//            e.printStackTrace();
//        }

//        // to write a file
//        try {
//
//            FileWriter myFileWriter = new FileWriter("file1.txt");
//            myFileWriter.write("This is our first file from this java course");
//            myFileWriter.close();
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        // Reading a file
//        File myFile = new File("file1.txt");
//        try{
//            Scanner scan = new Scanner(myFile);
//            while (scan.hasNextLine()){
//                String line = scan.nextLine();
//                System.out.println("Content is: \n"+line);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        // deleting a file
        File myFile = new File("file1.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: "+myFile.getName());
        }
        else{
            System.err.println("Some Error occur while deleting present file! named: "+myFile.getName());
        }
    }

}
