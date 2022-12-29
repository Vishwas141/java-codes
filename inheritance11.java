//METHOD OVERRIDING

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
}




public class inheritance11
{
    public static void main(String[] args)
    {
        vishwas v=new vishwas();
        v.display();//display from vishwas
        suyash s=new suyash();
        s.display();//display from suyash
    }
}
