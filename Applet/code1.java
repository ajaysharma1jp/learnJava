package Applet;
import java.awt.*;
import java.applet.*;
// require to import java.awt for graphics
// import java.applet for applet
// awt - abstract windows toolkit
// applets are small java program that are primarily used in internet computing
// run using applet viewer or any web browser that support java
// applet doesn't have main() method unlike applications, applets cannot run independently it needs web page using special feature called html tag
// applets can not read from or write to a file in local system
// applets can not communicate with other servers on network
// applets can not run a program from local computer
// applets are restricted from using libraries from other lang like c,c++

// applet lifecycle
// 1) initialization state(born state)
// when an applet is loaded it enters the initialization state this happens by calling the init() method of applet class
// initialization occurs only once in applet's lifecycle we need to override inti() method
//public void init(){.......(Action)........}

// 2) Running state
// When the system calls start() method of Applet class it enters in running state this occur automatically after applet is initialized
// start() method maybe called more than once unlike init() : if we leave web page to another and return back to it then it re start()
//public void start(){......(Actions.......}

// 3) Idle or Stopped state
//  when it is stopped from running-> when we leave current web page on which applet is running
//public void stop(){......(Actions).......}

// 4) Display State
// when it need some output opertations
// public void paint(Graphics g){.......(Actions).......}
// Display state is not considered as part of life cycle of applets


// Writing Java Applet code
//a) Building an applet code(.java file) and its (.class file)
//b) design a html web page and add a <APPLET> tag inside it
//c) incorporating <APPLET> tag into web page
public class code1 extends Frame{
    public static void main(String[] args) {
        code1 frame = new code1();
        Button b1 = new Button("Btn 1");
        Button b2 = new Button("Btn 2");
        Button b3 = new Button("Btn 3");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setLayout(new FlowLayout());
        frame.setLayout(new GridLayout(2,2));
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
