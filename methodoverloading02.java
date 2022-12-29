
public class methodoverloading02
{
   public void m1(String a)
   {
       System.out.println("String version");
   }
   public void m1(Object o)
   {
       System.out.println("Object version");
   }

  /* public void m1(StringBuffer s)
   {
        System.out.println("Stringbuffer version");
   }*/
   public static void main(String [] args)
   {
       methodoverloading02 m=new methodoverloading02();
       m.m1("vishwas");//string version
       m.m1(new Object());//object version
       m.m1(null);//string version/*
       /*here string and object take  null but child get higher priority than parent
        *but if string and stringbuffer present then both are accept the null as valid
        then it gives error because both are at same level
        */
   }
   
}
