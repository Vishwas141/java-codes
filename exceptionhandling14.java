import java.util.*;

                   
// when we pass the no  arguments as string 


class ToooldException extends RuntimeException
{
    
}

class TooYoungException extends RuntimeException
{
    
}

public class exceptionhandling14
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();

        if(age>60)
        {
            throw new ToooldException();
        }
        else if(age<18)
        {
            throw new TooYoungException();
        }
        else
        {
            System.out.println("your age has been in the range ");
        }
    }

}