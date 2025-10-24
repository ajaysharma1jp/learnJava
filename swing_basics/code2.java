package swing_basics;
import javax.swing.*;
import java.awt.*;

//how to create components like: button,textfiled and its label
public class code2 {
    public JFrame frame;
    code2() {
        frame = new JFrame();
        frame.setTitle("This is Button Demonstration");
        frame.setSize(400, 250);
        frame.setLayout(null);

        JButton btn = new JButton("Click Me!"); // create button
        btn.setBounds(32, 64, 100, 30);
        btn.setBackground(Color.decode("#87CEEB"));

        JLabel label = new JLabel("This is Java Swing btn tut!"); // create label
        label.setBounds(100, 114, 250, 30);

        JTextField textfield = new JTextField("Any Suggestions!"); // create text field
        textfield.setBounds(100, 134, 250, 30);

        // add all components before making the frame visible
        frame.add(btn);
        frame.add(label);
        frame.add(textfield);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // now make the frame visible
    }
    public static void main(String[] args) {
        new code2();
    }
}
