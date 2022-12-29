

class Array
{
   private String subid;
   private String subject;
   private int Maxmarks;
   private int obtainmark;

  public  Array()
    {
        subid="12345";
        subject="data structre";
        Maxmarks=100;
    }
    public Array(String a,String sub,int maxmarks)
    {
        subid=a;
        subject=sub;
        Maxmarks=maxmarks;
    }
   public void setobtainmarks(int c)
    {
        obtainmark=c;
    }
    public String getsubid(){return subid;}
    public String getsubject(){return subject;}
    public int getmaxmark(){return Maxmarks;};
    public int getobtainmarks(){return obtainmark;};


    public String toString()
    {
        return ("\nsubid : "+subid+"\n sub name: "+subject+" \nmaxmarks :"+Maxmarks+" \nobtainmarks "+obtainmark);

    }

}




public class arrayofobject
 {
    public static void main(String [] args)
    {
        Array a[]=new Array[3];
        for(int i=0;i<3;i++)
        {
         String x="1234";
         String sub="mp";
         int max=100;
         a[i]=new Array(x,sub,max);
         System.out.println("enter the obtain marks");
         int o=60;
         a[i].setobtainmarks(o);

        }
        for(Array h:a)
        {
            System.out.println(h);
        }

    }
   

    
}
