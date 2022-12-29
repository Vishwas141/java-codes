
abstract class vishwas 
{
    public abstract void m1();//abstract method 
    public void show()
    {
        System.out.println("show method");

    }


}
class suyash extends vishwas
{
    public void m1()
    {

    }
   

}
public class abstract03
{
    public static void main(String [] args)
    {
        suyash s=new suyash();
        s.m1();
    }
}




