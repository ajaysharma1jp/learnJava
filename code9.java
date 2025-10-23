// anonymous classes in java
// a class can contain another class known as nested class its possible to create a nested class without giving name
// a nested class that doesn't have any name is known as anonymous class
// anonymous classes usually extend subclasses or implement interfaces here ,type can be
// M-1) a superclass that an anonymous class extends
// 2) an interface that an anonymous class implements
public class code9 {
    public static void main(String[] args) {

        //here is how an anonymous class can be made
        //M-1)
        OuterClass obj = new OuterClass(){
            void sing(){}
            public void outerMethod(){}
        };


        //M-2)
        OuterInterface obj2 = new OuterInterface() {
            @Override
            public void interfaceMethod() {

            }
        };

        // they are only one time use class
    }
}

class OuterClass{
    public void otherMethod(){

    }
}

interface OuterInterface{
    void interfaceMethod();
}