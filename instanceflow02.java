



public class instanceflow02
{
    int i=10;
    {
        m1();
        System.out.println("hello thbis is first block");

    }

    instanceflow02()
    {
        System.out.println("constructor");
    }

    public static void main(String [] args)
    {
       instanceflow02 i=new instanceflow02();
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

