




public class overriding04 
{
    /*private void m1()
    {
        System.out.println("hello");
        //we cannot declare method as private which will restrict access of mwthod in child
    } */


    /*final void m1()
    {
        System.out.println("hello");//error here method declare as final
        which means we are not ablt to change the method in child
    }*/
 
    protected void m1()
    {
        System.out.println("hello");
    }
    public static void main(String []args)
    {
        overriding04 o=new child();//child get printed
        o.m1();
    }
    
}

class child extends overriding04
{
    public   void m1()
    {
        System.out.println("child");
    }
}


