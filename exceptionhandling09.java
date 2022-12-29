//throws keyword 

public class exceptionhandling09
{
    public static void main(String [] args) throws ArithmeticException
    
    {
      m1();
    }

    public static void m1()throws ArithmeticException
    
    {
        
        m2();
    }

    public static void m2() throws ArithmeticException
    {
        System.out.println(10/0);
    }
    
}

//throw keyword dont have any impact ont the unchecked exception
