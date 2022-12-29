



public class instanceflow01 
{
    int i=10;
    {
        m1();
        System.out.println("hello thbis is first block");

    }

    instanceflow01()
    {
        System.out.println("constructor");
    }

    public static void main(String [] args)
    {
       
        System.out.println("Main method");
    }

    public void m1()
    {
        System.out.println(j);
    }
    {
        System.out.println("second block");
    }

    int j=20;
}
