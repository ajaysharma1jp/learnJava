package io_Streams_codes;
import java.io.File;
import java.io.IOException;

public class code2 {
    public static void main(String[] args) {
        File myFile = new File("file1.txt");
        try{
            myFile.createNewFile();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
