
public class methodoverloading01
{
   public void m1(int a)
   {
       System.out.println(a);
   }
   public void m1(double d)
   {
       System.out.println(d);
   }
   public static void main(String [] args)
   {
       methodoverloading01 m=new methodoverloading01();
       m.m1(10);//m1 containing int as argument
       m.m1(10.00);//m1 containing double as argument
   }
   
}
