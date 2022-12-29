
import java.util.*;
class student
{
    private int id;
    private String name;

    public student()
    {
        id=0;
        name="teacher";

    }

    public student(int i,String  n)
    {
        id=i;
        name=n;
    }

    void display()
    {
        System.out.println(id+" named as "+name);

    }
}

public class arrayofobject2 
{
    public static void main(String [] args)
    {
    Scanner sup=new Scanner(System.in);
    int word=sup.nextInt();
    student []s=new student[3];
    for(int i=0;i<3;i++)
    {
        int k=sup.nextInt();
        String abcd=sup.nextLine();
        s[i]=new student(k,abcd);
    }
    for(int i=0;i<3;i++)
    {
        s[i].display();
    }


}

  
    
}
