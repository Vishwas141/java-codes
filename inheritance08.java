class vishwas
{
    protected int x;
    public vishwas(int x)
    {
        this.x=x;
    }
    public void print()
    {
        System.out.println("Hello vishwas");
    }
}
class suyash extends vishwas
{
    protected int y;
    public suyash(int x,int y)
    {
        super(x);

        this.y=y;
        
    }
    public void display()
    {
        System.out.println("hello suyash");
    }
}
class gaurav extends suyash
{
    protected int z;
    public gaurav(int x,int y,int z)
    {
        super(x,y);
        this.z=z;
        
    }
    public void show()
    {
        System.out.println(x+" "+y+" "+z);
    }
}



public class inheritance08
{
    public static void main(String[] args)
    {
        gaurav g=new gaurav(10,20,30);
       g.show();
    }
}