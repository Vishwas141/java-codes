class base
{
    protected int x;
    public base()
    {
        
    }
    public void print()
    {
        System.out.println(" "+x);
    }

}
class child extends base
{
    private int y;
    public child(int y)
    {
        
        this.y=y;

    }
    public void display()
    {
        System.out.println(" "+y);
    }


}



public class inheritance10
 {
    public static void main(String [] args)
    {

     child c=new child(10);
     c.display();

        
    }
    
}