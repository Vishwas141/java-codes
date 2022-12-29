class vishwas
{
    public void print()
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
}
class gaurav extends suyash
{
    public void show()
    {
        System.out.println("hello gaurav");
    }
}



public class inheritance06
{
    public static void main(String[] args)
    {
        gaurav g=new gaurav();
        g.print();
        g.display();
        g.show();
    }
}
