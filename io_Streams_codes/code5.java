package io_Streams_codes;


// input and output using
import javax.swing.JOptionPane;

public class code5 {
    public static void main(String[] args) {
        // 1. Input: Shows a pop-up box with a text field
        String name = JOptionPane.showInputDialog(null, "Please enter your name:");
        String surname = JOptionPane.showInputDialog("Please enter your surname: ");

        // 2. Output: Shows a simple message box
        JOptionPane.showMessageDialog(null, "Hello, " + name +" "+surname +"!");

        JOptionPane.showConfirmDialog(null,"Are You Sure!\nYour Name is: "+name+" "+surname);


    }
}