

interface vishwas
{
    void display();
    void print();
    void show();
}
abstract class implement implements vishwas
{
    public void display()
    {
        System.out.println("hello display");
    }
    public void print()
    {
        System.out.println("hello print");
    }
   
}
class child extends implement
{
    public void show()
    {
        System.out.println("hello show");
    }
}
public class interfaces02 
{
    public static void main(String [] args)
    {
        child c=new child();
        c.show();
       
    }
}
