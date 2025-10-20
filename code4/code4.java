//What is a Package in Java?
// is simply a container that groups related types(java classes,interfaces, enumerations, annotations)
//A package is a namespace that organizes classes and interfaces.
//Think of it as a folder or module where you keep related classes together.
//
//Helps avoid name conflicts (two classes with the same name in different packages are fine).
//
//Makes code easier to maintain and read.
//
//Controls access: classes in the same package can access each other’s package-private members.


// import method works in packages:
//import code4.Vehicle;  // import Vehicle class from code4 package
// or import code4.*; // import all classes from code4 package

package code4;// inheritance and inheritance chaining
//  is used to create a new class from existing class
// new class that is created is known as subclass(derived class) and existing class from where child class is derived is known as superclass(parent or base class)



public class code4 {
    public static void main(String[] args)
    {
        car c1 = new car();
        c1.wheels = 4;
        System.out.println("Wheels in car is: "+c1.wheels);
        c1.start();
        //🚧Polymorphism (Core OOP Power)
        Vehicle v = new car();  // parent ref → child object
        v.start();              // calls Car's overridden start()

        //Runtime decides which version to call (dynamic dispatch).

        twoCar t1 = new twoCar();
        t1.start();//  Car is starting
        //             This towCar is starting

        Vehicle v2 = new twoCar();
        v2.start(); //  Car is starting
        //              This towCar is starting
    }
}

//single level inheritance

//method overriding:
// if a subclass provides the specific implementation of method that has been declared by one of its parent class, it is known as method overriding:
// 1) method overriding is also known as runtime polymorphism hence we can achieve polymorphism in java with help of inheritance

//note:The @Override annotation ensures you’re actually overriding a method from the superclass.
//
//If you forget the exact signature, the compiler will warn you.


//super is a special keyword in java that is used to refer instance of immediate(just upper parent class) parent class
// uses of super keyword
// it is used to refer to an instance variables of immediate parent class
// it is used to invoke a method of immediate parent class
// it is used to invoke a constructor of immediate parent class

class car extends Vehicle{
    car() {
        //Constructor Chaining with super()
        super(); // calls Vehicle() constructor
        System.out.println("Car constructor");
    }
    void start(){
        System.out.println("Car is starting");
    }
}

// multilevel inheritance
//⚡ 6. Multilevel Inheritance
//
//Java supports multilevel (A → B → C), but not multiple inheritance (only one parent).
// multiple inheritance not supported

class twoCar extends car{
    void start(){
        super.start();
        System.out.println("This towCar is starting");
    }
}

//🔐 10. final Keyword
//
//Used to stop inheritance or stop overriding:

//🪞 5. Access Modifiers in Inheritance
//Modifier	                    Accessible in same class	subclass (same pkg)	    subclass (diff pkg) 	anywhere
//private	                    ✅	                                    ❌	            ❌                   ❌
//default (no modifier)	        ✅	                                    ✅	            ❌	                 ❌
//protected	                    ✅	                                    ✅	            ✅	                 ❌
//public	                    ✅	                                    ✅	            ✅	                 ✅



// more about final keyword in java(a non access modifier)
// final is used to define those entities that cannot be changed or modified in future
// final variable: variable with final keyword cannot be assigned again
// final method: method with final keyword cannot be overridden by its subclasses
// final class: class with final keyword cannot be extended or inherited from other classes


/*
🧩 this vs super in Java
Feature / Purpose	                            this	                                            super
Refers to	                    Current (child) class object	                                    Immediate parent (superclass) object
Access fields	                Access current class fields (useful when shadowed by parameters)	Access parent class fields hidden by child class
Access methods	                Calls current class methods	                                        Calls parent class methods (useful when overridden)
Constructor call	            this(...) calls another constructor in the same class	            super(...) calls parent class constructor
Placement rule	                Must be the first statement when calling another constructor	    Must be the first statement in child constructor
Inheritance level	            Refers to current class only	                                    Refers to immediate parent only
Used for method overriding	    To call overridden method of same class	                            To call overridden method of parent class
Use in static context	        ❌ Not allowed	                                                    ❌ Not allowed
Example (field access)	        this.color = color;	                                                super.color = "red";
Example (constructor call)	    this("blue");	                                                    super("Vehicle");
Example (method call)	        this.showDetails();	                                                super.showDetails();


*/