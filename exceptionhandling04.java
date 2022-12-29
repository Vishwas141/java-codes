public class exceptionhandling04
{
    public static void main(String [] args)
    {
        try
        {
            System.out.println("hello vishwas");
            System.out.println(10/0);
            System.out.println("hello vishwas second");
        }
        catch(ArithmeticException e)
        {
          System.out.println(10/5);
        }
    }

}