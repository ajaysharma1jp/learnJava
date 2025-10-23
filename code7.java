
//java interfaces
// an interface is a fully abstract class, it includes a group of abstract methods(methods without a body, no regular functions)
// we use interface keyword tp create an interface in java
// like abstract classes we cannot create objects of interfaces
// to use an interface other classes must implement it. we use implements keyword to implement an interface
// in interface we can only set variables to public static final (it is implicit by default)
public class code7 {
    public static void main(String[] args) {

    }
}

interface Pets{
    int legs=4; // by default public static final
    void eats();
}
interface Bird{
    int wings=2;
    void eats();
}
class Monkey implements Pets{

    @Override
    public void eats() {

    }
}

// advantages of java interfaces
// they can be used to achieve multiple inheritance (no diamond ambiguity problem)
class Eagle implements Pets,Bird{

    @Override
    public void eats() {

    }
}

/*



* | Feature                  | Abstract Class                                                                     | Interface                                                                           |
| ------------------------ | ---------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| **Methods**              | Can have both abstract and concrete methods.                                       | Can have only abstract methods (before Java 8) or default/static methods (Java 8+). |
| **Constructor**          | Can have constructors.                                                             | Cannot have constructors.                                                           |
| **Multiple Inheritance** | A class can inherit only one abstract class.                                       | A class can implement multiple interfaces.                                          |
| **Fields/Variables**     | Can have instance variables.                                                       | Can only have constants (static final).                                             |
| **Access Modifiers**     | Can have different access modifiers.                                               | Methods in interfaces are implicitly public.                                        |
| **Usage**                | Use when you have shared behavior and want to provide some default implementation. | Use when you want to define a contract that multiple classes can implement.         |

* */

/*
* | Feature              | `extends`                             | `implements`                           |
| -------------------- | ------------------------------------- | -------------------------------------- |
| Used with            | Class → Class / Interface → Interface | Class → Interface                      |
| Type of relationship | Inheritance (is-a)                    | Implementation (contract)              |
| Multiple allowed?    | Only one class (single inheritance)   | Multiple interfaces (multiple allowed) |
| Inherits/Implements  | Fields and methods (if class)         | Only method declarations (no fields)   |

*
* example mixing both
* interface Flyable {
    void fly();
}

class Pets {
    void eat() {
        System.out.println("Pets eating");
    }
}

class Bird extends Pets implements Flyable {
    public void fly() {
        System.out.println("Bird flying");
    }
}

* */