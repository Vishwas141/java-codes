//METHOD OVERRIDING dynamic dispatch

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




public class inheritance12
{
    public static void main(String[] args)
    {
        vishwas v=new suyash();
        v.display();//call of overrided method depen upon the object
        //not on the class hence here suyash display method get called
        
    }
}

