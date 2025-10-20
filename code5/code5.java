package code5;



//java access modifiers:Access modifiers control visibility and accessibility of classes, fields, methods, and constructors.
//
//Java has four main modifiers:
//| Modifier             | Class | Same Class | Same Package | Subclass (diff package) | World / Anywhere |
//| -------------------- | ----- | ---------- | ------------ | ----------------------- | ---------------- |
//| `private`            | ❌     | ✅          | ❌            | ❌                       | ❌                |
//| default (no keyword) | ✅     | ✅          | ✅            | ❌                       | ❌                |
//| `protected`          | ✅     | ✅          | ✅            | ✅                       | ❌                |
//| `public`             | ✅     | ✅          | ✅            | ✅                       | ✅                |


// note: Unlike C++, Java does not allow controlling accessibility via friend or explicit namespace rules. Access is strictly determined by these modifiers.
//Subtle point: If a subclass is in a different package, you can access protected fields/methods only through inheritance, not via a reference to parent object.


//Access Modifiers for Classes
//
//Top-level classes (not inner classes) can be:
//public → accessible everywhere
//default (no keyword) → accessible only within same package
//❌ cannot be private or protected
//Inner / nested classes can use all four modifiers.

//| Modifier  | Fields                     | Methods                    | Inheritance       | Overriding        |
//| --------- | -------------------------- | -------------------------- | ----------------- | ----------------- |
//| private   | only in class              | only in class              | ❌                 | ❌                 |
//| default   | class + package            | class + package            | ❌ outside package | ❌ outside package |
//| protected | class + package + subclass | class + package + subclass | ✅                 | ✅ in subclass     |
//| public    | everywhere                 | everywhere                 | ✅                 | ✅                 |


//Subtle & Deep Points:
//Protected access outside package:
//Accessible in subclass only through inheritance, not through a reference of parent class.
//Package-private (default) is often overlooked, but it’s widely used for internal library APIs.
//Private members can be accessed via getters/setters, often used for encapsulation.
//Static fields/methods respect same rules.
//Inner classes can have more flexible access:
//          Private inner class is invisible outside the outer class.
//Access cannot be reduced in overridden methods:
//          You cannot override a public method in subclass and make it protected or private.
//          You can increase visibility, e.g., protected → public.

public class code5 extends Teacher{ // inherit Teacher class for code 5 to view/edit protected onces
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.teachingClass = 12;

        code5 myCode = new code5();
        myCode.studentCount = 60;

        Person p1 = new Person();
        p1.setAge(5);
        p1.setName("Sinch-an");

        p1.Display();


        System.out.println(Person.noOfPersons);
        System.out.println(p1.noOfPersons);

        Person p2 = new Person("Sinchan");
        System.out.println(Person.noOfPersons);
        System.out.println(p2.noOfPersons);

        // other common inbuild example of static method
        System.out.println(Math.max(9,11)); // since max is static function inside class Math so we do not need to create a object of Math first to access methord max

    }
}

//Best Practices
//Default: private — encapsulate as much as possible.
//Use protected for inheritance points only.
//Use public for APIs meant to be used globally.
//Avoid default package in large projects — always use named packages.