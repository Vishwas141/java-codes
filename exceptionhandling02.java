import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exceptionhandling02 {
    
     public static void main(String []args) throws FileNotFoundException
    {
        PrintWriter pw=new PrintWriter("abcd.txt");
        pw.println("hello");
        System.out.println(10/0);
    }
}
