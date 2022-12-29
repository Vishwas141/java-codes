class a
{
    static int a=b.j;
}
class b
{
    static int j=c.k;
}

class c
{
    public  void show()
    {
       static int k=coupling.m1();
    System.out.println(k);

    }
  

}


public class coupling
 {
    public static void main(String [] args)
    {
        coupling e=new coupling();
        int d=e.m1();
        System.out.println(d);
        c C=new c();


    }
    public static int  m1()
    {
        return 10;
    }
    
}

