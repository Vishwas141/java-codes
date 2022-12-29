import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class expectionhandling10 
{
    //exception handling using try catch 
    public static void main(String []args)
    {
        try
        {
               System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
               System.out.println("arithmetic exception was found in programme");
        }
    }
    
}
