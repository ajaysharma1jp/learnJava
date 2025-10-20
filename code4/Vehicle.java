package code4;

public class Vehicle {
    int wheels;
    String color;

    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    void start(){
        System.out.println("Vehicle is Starting");
    }
    void setColor(String color){
        this.color = color;
    }
    void getColor(){
        System.out.println("Vehicle color is: "+color);
    }
}
