class p
{
    public void m1()
    {
        System.out.println("parent  class");  
    }

}
class c extends p
{
    public void m2()
    {
        System.out.println("child class");
    }
}


public class inheritance14
{
    public static void main(String [] args)
    {
        p parent=new p();
        parent.m1();

        c child=new c();
        child.m1();

        p p1=new c();
        p1.m1();

    }    
}
