package multithreading_codes;
// joining Threads
public class code4 implements Runnable{
    private String threadName;
    code4(String name){
        this.threadName = name;
        System.out.println("Thread: "+threadName+", "+"State: New");
    }
    public void run(){
        System.out.println("Thread: "+threadName+", "+"State: Running");
        for(int i=4; i>0; i--){
            System.out.println("Thread: "+threadName+", "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
        System.out.println("Thread: "+threadName+", "+"State: Dead");
    }

    public static void main(String[] args) {
        code4 c1 = new code4("Demo 1");
        code4 c2 = new code4("Demo 2");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

    }

}
