package swing_basics;
import javax.swing.*;
import java.awt.*;


//AWT's "heavyweight" model was problematic. So, Sun Microsystems created Swing
// basics of Swing: they are written in java and are drawn by java not by OS
// they are platform independent acts same in windows linux macos
// naming: All Swing component start with a 'J' : 1) AWT Frame = Swing JFrame 2) AWT Button = Swing JButton 3) AWT Panel = JPanel

// important Swing rule: You don't add components directly to a JFrame, You can add them to its Content Pane
// AWT: frame.add(button)
// Swing: frame.getContentPane().add(button); (or modern shorthand: frame.add(button);)
// Also, setting a Swing window to close is much easier:
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// how to create a JFrame
// m-1: by JFrame obj on JFrame class
public class code1 {
    code1(){
        JFrame frame = new JFrame();
        frame.setTitle("This is by Frame Object from class JFrame");
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To ensure the app closes when the window is closed
    }
    public static void main(String[] args) {
        new code1();
        Sample1 s1 = new Sample1();
    }
}
// m-2 by extends JFrame->here we do not need to create object of JFrame
class Sample1 extends JFrame{
    Sample1(){
        setLayout(null);
        setSize(400,200);
        setVisible(true);
        setTitle("This is by Extends JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To ensure the app closes when the window is closed
    }
}