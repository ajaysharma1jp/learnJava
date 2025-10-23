
// java abstract class
// abstract class in java cannot be instantiated (we cannot create objects of abstract classes)
// we use abstract keyword to declare abstract class
// an abstract class can have both regular and abstract methods
// a method that does not have its own body is know as abstract method
// we need to make whole normal class as abstract if there is any single abstract method present in any normal class
// though abstract class cannot be instantiated,we can create subclasses from it, we can then access members of abstract class using object of subclass
// if abstract class includes any abstract method then all child classes inherited from abstract superclass must provide implementation abstract method
public class code6 {
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.accelerate();
        c1.brake();

        c1.honks();


    }
}

abstract class Vehicle {
    abstract void accelerate();
    abstract void brake();

    void honks(){
        System.out.println("Vehicle Honks");
    }
}

class Car extends Vehicle {
    @Override
    void accelerate(){
        System.out.println("Car is Accelerating");
    }

    @Override
    void brake(){
        System.out.println("Car is Stopping");
    }
}
