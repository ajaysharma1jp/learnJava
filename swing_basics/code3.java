package swing_basics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//how to create event listeners on components
public class code3 {
    public JFrame frame;
    code3() {
        frame = new JFrame();
        frame.setTitle("This is Button Demonstration");
        frame.setSize(400, 250);
        frame.setLayout(null);

        JButton btn = new JButton("Click Me!");
        btn.setBounds(32, 64, 100, 30);
        btn.setBackground(Color.decode("#87CEEB"));

        JLabel label = new JLabel("This is Java Swing btn tut!");
        label.setBounds(100, 114, 250, 30);

        JTextField textfield = new JTextField("Any Suggestions!");
        textfield.setBounds(100, 134, 250, 30);

        JButton wordCount = new JButton("Word Count");
        wordCount.setBounds(100,32,100,25);

        // how to create action listener on btn component
        // addActionListener(object ActionListener())
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Okay, You Clicked Btn");
                textfield.setText("Success!");
            }
        });

        wordCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textfield.getText();
                String[] words = text.split(" ");
                label.setText("Total Char: "+text.length()+", Total Words: "+words.length);
            }
        });

        frame.add(btn);
        frame.add(label);
        frame.add(textfield);
        frame.add(wordCount);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new code3();
    }
}

