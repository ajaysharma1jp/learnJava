package awt_basics;
import java.awt.*;
import java.awt.event.*;
// a event handling make allow your code to react to events like click,mouse movements, key presses
// event handling model (The "Doorbell" analogy)
// java event model has three parts:
// 1) Event Source: component that are used to interacts with(eg. buttons) this is doorbell button
// 2) Event Object: an object created by source that describes what happened(eg an ActionEvent object for a button click) this is doorbell "ring" signal
// 3) Event Listener: an object whose job is to "listen" for specific events and executes code when one happens. This is you, waiting to hear doorbell
// ex: source.addEventListener(listener);

//Event handling classes and interfaces
// Event interfaces: these define methods a listener must have. To "listen" for an event, your class must implement the corresponding interface
// ActionListener: For button clicks, menu selections. Method: actionPerformed(ActionEvent e)
// MouseListener: For mouse clicks, presses, releases. Method: mouseClicked() mousePressed() etc
// KeyListener: For key presses. Methods: keyPressed(), keyTyped() etc

// Event Classes: These are "event objects" that get passed to your listener methods They contain information about event
// ActionEvent: contains info on which button was clicked
// MouseEvent: contains (x,y) coordinates of mouse
// KeyEvent: contains which key was pressed

//Handling Mouse and Keyboard Events
// example that actually make window close when you click 'x' button. This involves a WindowListener
public class code2 extends Frame implements WindowListener,ActionListener{
    code2(){
        // component setup
        Button b = new Button("Click ME!");
        Label l = new Label("Waiting for click");

        // add layout and buttons to it
        setLayout(new FlowLayout());
        add(b);
        add(l);

        // event "Wiring"
        // Register 'this' object as listener for window events
        this.addWindowListener(this);
        // Register 'this' object as listener for buttons action events
        b.addActionListener(this);


        // window setup
        setTitle("Better AWT Window");
        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new code2();
    }

    // method for action listener
    @Override
    public void actionPerformed(ActionEvent e) {
        // find the label (this is tricky in AWT, easier in Swing
        // for simplicity let just print to console
        System.out.println("Button was clicked");
    }

    // method for window listener
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        // this is the one we aim about
        dispose(); // close window
        System.exit(0); // Stop program
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
