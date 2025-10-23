package io_Streams_codes;
import java.io.File;
// checking status of file
import java.io.IOException;
public class code4 {
    public static void main(String[] args) {
        File myFile = new File("file1.txt");
        System.out.println("Checking status for: "+myFile.getAbsolutePath());
        if(myFile.exists()){
            System.out.println("File Exists: YES");
            System.out.println("Is it a file? "+myFile.isFile());
            System.out.println("Is it a directory? "+myFile.isDirectory());
            System.out.println("Can we read? "+myFile.canRead());
            System.out.println("Can we write? "+myFile.canWrite());
            System.out.println("File Size (bytes)? "+myFile.length());

        }else {
            System.out.println("File Exists: NO");
        }
    }
}
