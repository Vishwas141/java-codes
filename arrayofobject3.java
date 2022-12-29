import java.util.Scanner;
class vishwas
{
    private String name;
    private int marks;
    private String subject;

    public vishwas()
    {
            name=" ";
            marks=0;
            subject="None";
    }
  public vishwas(String s,int m,String sub)
    {
        name=s;
        marks=m;
        subject=sub;

    }
    public void display()
    {
        System.out.println("name of student :"+name+" name of subject :"+subject+"marks :"+marks);

    }

}






public class arrayofobject3
 {
    public static void main(String []args)
    {
        vishwas []v=new vishwas[3];
          Scanner virat=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
          
            int mark=virat.nextInt();
            String naam=virat.next();
            String subje=virat.next();
            v[i]=new vishwas(naam,mark,subje);

        }
        for(int i=0;i<3;i++)
        {
          v[i].display();

        }
    }
}
