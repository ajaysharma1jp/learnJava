package multithreading_codes;
// using Thread class extends
class MyAnotherThread extends Thread{
    public void run(){
        for(int i=10; i>=1; i--){
            System.out.println("Another Thread = "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
public class code2 {
}
