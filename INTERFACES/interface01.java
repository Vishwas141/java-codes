package INTERFACES;

interface vishwas
{
    void display();
    void print();
    void show();
}
class implement implements vishwas
{
    public void display()
    {
        System.out.println("hello display");
    }
    public void print()
    {
        System.out.println("hello print");
    }
    public void show()
    {
        System.out.println("hello show");
    }

}
public class interface01 
{
    public static void main(String [] args)
    {
        implement i=new implement();
        i.display();
        i.show();
        i.print();
    }
}
