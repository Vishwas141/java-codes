class parent
{
    private void m1()
    {
        System.out.println("hello parent");

    }


}

class child extends parent
{
   private void m1()
   {
        System.out.print("hello child");
   }
}





public class Overriding01
{
    public static void main(String [] args)
    {
        parent p=new parent();
        //we cannot ablt to access the m1 method in parent beacuse it is priavyte p.m1();
        child c=new child();
       // c.m1(); same not accessible to the this class 

    }
    
}
