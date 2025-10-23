package multithreading_codes;

public class Example extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            try {
                sleep ((int)(Math.random()*5000)); // for 5 secs
            }catch (InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        new Example().start();
        new Example().start();
        System.out.println("Done!");
    }
}
