class parent
{
    public void display()
    {
        System.out.println("hello world");
    }
}
class child extends parent
{
    public void show()
    {
        System.out.println("base class");
    }
}





public class inheritance15
 {
    public static void main(String [] args)
    {
        parent p=new parent();
        p.display();
        child c=new child();
        c.display();
        parent p1=new child();
        p1.display();
    }
    
}
