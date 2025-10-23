import java.io.File;
import java.io.FileInputStream;
//import java.io.IO;
import java.io.IOException;

//Exception handling -- same concept as c++
// two types JAVA Runtime Exceptions and JAVA IOExceptions
public class code10 {
    public static void main(String[] args){
        // try catch block
        int a[] = new int[5];
        System.out.println("Hello World!");
        try{
            int result = 10/0;
            System.out.println(a[9]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Tried to excess out of bound element");
        }catch(ArithmeticException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
//        }catch(IOException e){
//
//        }

        // another way to combine all
        System.out.println("Hello World!");
        try{
            int result = 10/0;
            System.out.println(a[9]);

        }catch (ArrayIndexOutOfBoundsException | ArithmeticException  e){
            System.out.println("Tried to excess out of bound element");
//        }catch(IOException e){
//
        }finally{ // finally block run always no matter if any exception occur or not
            // there should be only one finally block
            // there can be many catch block
            // a finally can be without catch block as try and finally
            System.out.println("I will run always no matter if any exception occur or not");
        }
    }
}

// java throw and throws
class main{
    void findFile() throws IOException{
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}
// throw keyword is used to explicitly throw single exception
//ex:
//class Main{
//    void divideByZero( {)}
//    throw new ArithmeticException("Trying to divide by 0");
//}