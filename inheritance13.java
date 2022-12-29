class vishwas
{
    public void display()
    {
        System.out.println("Hello vishwas");
    }
}
class suyash extends vishwas
{
    public void display()
    {
        System.out.println("hello suyash");
    }
    public void print()
    {
        System.out.println("hello base suyash");
    }
}



public class inheritance13
{
    public static void main(String[] args)
    {
      vishwas v=new suyash();
      v.display();
     // v.print();we cannot able to call child specific methods
      
    }
}
