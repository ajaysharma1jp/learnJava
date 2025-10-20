// oops-1
// there will be only 1 public class which is same name as file name
// other classes can be non public

// a class is not allocated memory when it is defined
// an object allocated memory when its is created
// class is a logical entity whereas objects are physical entities

public class code1 {
    public static void main(String[] args)
    {
        Dog dog1 = new Dog(); // dog1 is a object it a non primitive data type
        System.out.println("Dog name is: "+dog1.name); // strings are defaults to null
        System.out.println("Dog age is: "+dog1.age); // int are defaults to 0

        dog1.age = 5;
        System.out.println("Dog age is: "+dog1.age);
        dog1.setName("Lura");
        dog1.bark();
        dog1.walk();
        System.out.println("Dog name is: "+dog1.name);
        dog1.getName();

    }
}

class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println("Dog is walking");
    }

    void bark(){
        System.out.println("Dog is barking");
    }

    void getName(){
        System.out.println("Dog name is: "+name);
    }

    void setName(String name)
    {
        this.name = name;
    }
}

