import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


class data
{
    private String name;
    private String village;
    private String college;
    private double percentile;
    private String exam;
    private int general_rank;
    private String category;


    public void setdata()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the your name");
        name=s.next();
        System.out.println("Enter your village name");
        village=s.next();
        System.out.println("Enter your college name");
        college=s.next();
        System.out.println("Enter your mht-cet percentile");
        percentile=s.nextDouble();
        System.out.println("Enter your exam name");
        exam=s.next();
        System.out.println("Enter your general rank  in "+exam);
        general_rank=s.nextInt();
        System.out.println("Enter your category");
        category=s.next();
    }
    public int check_qualification()
    {
        if(general_rank<=1000)
               return 1;
        else if(general_rank>1000 && general_rank<=1500)
             return 2;
        else if(general_rank>1500 && general_rank<=2500)
         return 3;
        else
         return 4;

    }

    void display()
    {
        System.out.println("name of student :"+name);
        System.out.println("name of student village :"+village);
        System.out.println("name of student  college name :"+college);
        System.out.println("name of student  percentile in mht-cet :"+percentile);
    
    }




}

public class arrayofobject4 
{
    public static void main(String []args)
    {
        data []t=new data[3];
        for(int i=0;i<3;i++)
        {
            t[i]=new data();
            t[i].setdata();
        }
        for(int i=0;i<3;i++)
        {
            int d=t[i].check_qualification();
            t[i].display();
            if(d==1)
            {
             
              System.out.println("admission ");
               System.out.println("college of engineering pune");
            }
            else if(d==2)
            {
                System.out.println("admission ");
                System.out.println("walchand college of engineering sangli");


            }
            else if(d==3)
            {
                System.out.println("admission ");
                System.out.println("pune institute of technology dhankawadi");
            }
            else
            {
                System.out.println("admission ");
                System.out.println("None");
            }

            
             

        }
    }
    
}
