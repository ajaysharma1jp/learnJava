package awt_basics;
import java.awt.*;
public class code1 extends Frame {
    code1(){
        // create a Button
        Button b1 = new Button("Click Me!");
        Button b2 = new Button("Click Me!");
        Button b3 = new Button("Click Me!");
        Button b4 = new Button("Click Me!");
        Button b5 = new Button("Click Me!");
        Button b6 = new Button("Click Me!");
        Button b7 = new Button("Click Me!");

        // set the layout ,Manager
        // a flow layout places components(like Buttons here) in a row, one after another when row is full it "flows" to next one
        // default for: Panel ex: myPanel.setLayout(new FlowLayout);
        setLayout(new FlowLayout());


        // add Button to the frame
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);

        // a border layout divides the container into 5 distinct regions: North South East West Centre
        // default for: Frame ex: setLayout(new BorderLayout());
        // here you must specify the region when adding
        // only 5 regions is max limit you can have in this layout after that it replaces over and over again
        // ex:
        setLayout(new BorderLayout());
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.EAST);
        add(b5,BorderLayout.CENTER);
        add(b6,BorderLayout.WEST); // this will take over b2
        add(b7,BorderLayout.NORTH); // this will take over b1

        //grid layout: arranges components in a simple grid of equal sized cells its perfect for a calculator keypad or chessboard
        // ex:
        // creates a 3-row 2-column grid
        // here add as many as buttons needed, but size of each will be equal
        setLayout(new GridLayout(3,2));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(new Button("btn-8"));
        add(new Button("btn-8"));
        add(new Button("btn-8"));
        add(new Button("btn-8"));
        add(new Button("btn-8"));
        add(new Button("btn-8"));
        add(new Button("btn-8"));
        add(new Button("btn-8"));

        //card layout: Stacks components(usually panels) on top of each other like a deck of cards. Only one "Card" is visible at a time
        // this is useful for wizards(like a installer) or a tabbed interfaces
        // ex:
        // use method like cardLayout(container,"cardName") to switch which card is visible


        // set the window properties
        setTitle("My First AWT Window");
        // here width is 300 and height is 150
        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new code1();
    }
}
