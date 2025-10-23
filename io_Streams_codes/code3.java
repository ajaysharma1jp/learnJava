package io_Streams_codes;
import java.io.*;

// reading and writing by bufferedReader and bufferWriter
public class code3 {
    public static void main(String[] args) {


        // use try with resources statement
        //write
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("file1.txt"))){
            writer.write("Hello, World! This is Java For fileManagement!");
            writer.newLine();
            writer.write("This File name is file1 and it is a text file.");
        }catch (IOException e){e.printStackTrace();}

        //read
        // so that resources automaticall closes
        try(BufferedReader reader = new BufferedReader(new FileReader("file1.txt"))){
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
