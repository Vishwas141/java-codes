class parent
{
    public parent()
    {
        System.out.println("parent class constructor ");
    }
}

class child extends parent
{
    public child()
    {
        System.out.println("child class constructor");
    }
}

class grandchild extends child
{
    public grandchild()
    {
        System.out.println("grandchild constructor called");
    }
}


public class inheritance02 
{
    public static void main(String [] args)
   {
          parent p=new parent();
          child c=new child();
          grandchild g=new grandchild();
   }    
}
