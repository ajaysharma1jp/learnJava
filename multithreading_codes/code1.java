package multithreading_codes;

import java.lang.reflect.AnnotatedArrayType;

// m-1: using implements on runnable interface
//creating our thread using Runnable interface
class MyThread implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++)
        {
            System.out.println("Value if i is: "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}

public class code1 {


    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        // t1.start(); // can't start it since it does not have start method
        Thread thr = new Thread(t1); // we have to make obj of Thread inbuild class to make it start
        // under Thread constructor we need to pass object of MyThread which implements Runnable and having run method

        // now we can use start() method but not on t1
        // we need our thr obj of Thread
        thr.start();


        // using m-2 : in code2.java(using Thread class extends)
        // first create a object of another thread
        MyAnotherThread t2 = new MyAnotherThread();
        // no need to create obj of Thread now since start also inherit in MyAnotherThread class
        t2.start();
    }

}
