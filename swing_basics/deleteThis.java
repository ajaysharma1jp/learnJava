package swing_basics;
import javax.swing.*;
import java.awt.*;

public class deleteThis {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.add(new Button("OK"));
        frame.add(new Button("Cancel"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
