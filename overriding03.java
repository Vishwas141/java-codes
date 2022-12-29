abstract class parent
{
    public abstract void m1();//declaration of abstract method 
   


}

class child extends parent
{
   public void m1()
   {
        System.out.print("hello child");//implementation of m1 method
   }
}





public class overriding03
{
    public static void main(String [] args)
    {
        
        child c=new child();
        c.m1();

    }
    
}
