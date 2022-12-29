public class typecasting01 
{
    public static void main(String [] args)
    {
        Object o=new String("vishwas");
        StringBuffer sb=(StringBuffer)o;
        //it gives run time error and dont give compile time error
    }
    
}
