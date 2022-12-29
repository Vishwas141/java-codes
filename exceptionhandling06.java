
//throws keyword

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.*;


public class exceptionhandling06 
{
    public static void main(String [] args) throws FileNotFoundException
    {
       PrintWriter pw=new PrintWriter("abc.txt");
       pw.println("hello vishwas");

    }
    
}







