

public class constructor01
{
    /*

    constructor01()
    {
        this(10);
    }
    constructor01(int i)
    {
        this();
    }
        this is recursive constructor calling which is error
        
    */
    constructor01()
    {}

    public static void main(String []args)
    {
        System.out.println("hello");
    }

    
}

class child extends constructor01
{
    child()
    {

    }
}
