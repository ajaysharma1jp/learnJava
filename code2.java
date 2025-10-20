// method overloading -- compile time polymorphism
// two or more methods can have same name inside the same class if they accepts different arguments
// method overloading can be archived by either : a) changing number of arguments 2) or changing data type of argument
// if we change return type of method then it is not consider as method overloading
public class code2 {
    public static void main(String[] args)
    {
        Greet g1 = new Greet();
        g1.greet();
        g1.greet("Ravi");
        int times = 5;
        g1.greet("Rohan",times);
        System.out.println("Times is: "+times); // this is still 5
    }
}

class Greet{
    void greet(){
        System.out.println("Hello, GoodMorning");
    }
    void greet(String name){
        System.out.println("Hello "+name+", GoodMorning!");
    }
    void greet(String name, int times){
        while(times>0){
            System.out.println("Hello "+name+", GoodMorning!");
            times--;
        }
    }
}