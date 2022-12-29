class base
{
    protected int x;
    public base(int x)
    {
        this.x=x;
    }
    public void print()
    {
        System.out.println(" "+x);
    }

}
class child extends base
{
    private int y;
    public child(int x,int y)
    {
        super(x);
        this.y=y;

    }
    public void display()
    {
        System.out.println(x+" "+y);
    }


}



public class inheritance05
 {
    public static void main(String [] args)
    {
        base b=new base(10);
        b.print();
        child c=new child(100,20);
        c.print();
    
        c.display();

        
    }
    
}
