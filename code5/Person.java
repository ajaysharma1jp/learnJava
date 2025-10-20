package code5;
// the static keyword
// if we want to access class members without creating an instance of class, we need to declare the class members static
// static variables can be accessed by calling class name of class
// there is no need to create an instance of class fro accessing static variables because static variables are class variables and are shared among all class instances


// keywords such as this and super are not used in body of static method
// modification of the static field value is not allowed

// note:
// Static blocks are used to do some things before object is created
// denoted by:"   static{      }     "
public class Person {

    static int noOfPersons = 0;

    private int age;
    private String name;
    Person(){
        noOfPersons++;
        this.name = "N/A";
        this.age = 0;
    }
    Person(String name){
        this(name,18);
    }
    Person(String name, int age){
        noOfPersons++;
        this.name=name;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    public void Display(){
        System.out.println("Name: "+name+" Age: "+age);
    }

}
