class vishwas
{
    public vishwas()
    {
        System.out.println("welcome vishwas");
    }
    public void print()
    {
        System.out.println("Hello vishwas");
    }
}
class suyash extends vishwas
{
    public suyash()
    {
        System.out.println("welcome suyash");
    }
    public void display()
    {
        System.out.println("hello suyash");
    }
}
class gaurav extends suyash
{
    public gaurav()
    {
        System.out.println("welcome gaurav");
    }
    public void show()
    {
        System.out.println("hello gaurav");
    }
}



public class inheritance07
{
    public static void main(String[] args)
    {
        gaurav g=new gaurav();
        g.print();
        g.display();
        g.show();
    }
}