public class exceptionhandling03
{
    public static void main(String [] args)
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();//print the exception information
            System.out.println(e.getMessage());
            System.out.println(e);//print information of error not trace whole 
        }
    }

}