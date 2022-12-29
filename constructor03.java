import java.io.*;

public class constructor03
{

    constructor03() throws IOException
    {

    }
    public static void main(String [] args) throws IOException
    {
        child c=new child();
    }
    
}
class child extends constructor03
{
    child() throws IOException
    {

    }
}