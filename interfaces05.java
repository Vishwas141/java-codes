

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
   
   
}
abstract class child extends implement
{
    public void show()
    {
        System.out.println("hello show");
    }
}
class subchild extends child
{
    public void print()
    {
        System.out.println("hello print");
    }
}
public class interfaces05
{
    public static void main(String [] args)
    {
        subchild c=new subchild();
        c.show();
       
    }
}