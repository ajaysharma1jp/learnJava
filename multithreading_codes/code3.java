package multithreading_codes;
// thread operations

class Thread3 extends Thread{
    public void run(){
        System.out.println("This is a user defined Thread!");
    }
}

public class code3 {
    public static void main(String[] args) {
        System.out.println("Program Started!");

        int x = 56+34;
        System.out.println("Sum is: "+x);
        Thread t = Thread.currentThread();

        Thread3 userThread = new Thread3();

        String tName = t.getName(); // to get thread name
        System.out.println("Current running Thread name: "+tName);
        // to set thread name
        t.setName("MyAddThread");
        System.out.println("Current running Thread name: "+t.getName());

        try {
            Thread.sleep(2000); // for 2 sec thread will stop
        }catch (Exception e){}

        System.out.println("Thread id: "+t.getId());


        System.out.println("Program Ended!");

        userThread.start();
    }
}
