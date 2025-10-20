// constructors are invoked implicitly when you instantiate objects
// two rules for creating constructors are: 1) name of constructor should be same as class name
// 2) java constructor must not have a return type
// if its doesn't have constructor a default constructor initializes instance variables with default values

// constructor cannot be abstract or static or final
// a constructor can be overloaded bu not be overridden

// this keyword
// in java this keyword is used to refer current object inside a method or a constructor
// // this keyword is used to remove any ambiguity in variable names
// we can also invoke method of current class or to invoke a constructor of current class
public class code3 {
    public static void main(String[] args)
    {
        Cat d1= new Cat("sara",44,"orange"); // we cannot call default java constructor if we declare any constructor in class
    }
}

class Cat{
    String name;
    int age;
    String color;

    Cat(){
        this("omni",2,"orange");// calls another constructor
    }

    Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void walk(){
        System.out.println("Cat is walking");
    }

    void meow(){
        System.out.println("Cat is meowing");
    }

    void getName(){
        System.out.println("Cat name is: "+name);
    }

    void setName(String name)
    {
        this.name = name;
    }

    void showColor() {
        System.out.println(this.color); // can also call another method with 'this'
    }

    int setAge(int age)
    {
        this.age = age;
        return  age;
    }
    void SetAndShowAge(int age){
        System.out.println(this.setAge(age));
    }
}
