import java.io.FileNotFoundException;
import java.io.PrintWriter;

//throws keyword 

public class exceptionhandling07
{
    public static void main(String [] args)
    {
        try
        {
            PrintWriter pw=new PrintWriter("abcde.txt");
            pw.println("hello");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("hello file not found exception");
        }
    }
    
}
