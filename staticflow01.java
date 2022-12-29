public class staticflow01
{
    static int i=10;
    static{
 m1();
 System.out.println("first static method");
    }
    public static void main(String []args)
    {
        m1();
        System.out.println("main ");
    } 

    public static void m1()
    {
        System.out.println("m1 method ");
    }
  static
  {
    System.out.println("second static method");
  }

}




