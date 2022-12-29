import java.util.*;

import javax.lang.model.util.ElementScanner14;

//                  CUSTOMIZED EXCEPTION                      



class ToooldException extends RuntimeException
{
     ToooldException(String s)
     {
        super(s);
     }
}

class TooYoungException extends RuntimeException
{
    TooYoungException(String s)
    {
        super(s);
    }
}

public class exceptionhandling13
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();

        if(age>60)
        {
            throw new ToooldException("you are too Young");
        }
        else if(age<18)
        {
            throw new TooYoungException("Too Old are ");
        }
        else
        {
            System.out.println("your age has been in the range ");
        }
    }

}