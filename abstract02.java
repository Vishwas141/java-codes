
abstract class vishwas
{

  String name;
  int age;
  //abstarct class qwith with constructor

  vishwas(String name,int age)
  {
    this.name=name;
    this.age=age;
  }


}
class suaysh extends vishwas
{
    int roll;
    int marks;
    suaysh(String name,int age,int roll,int marks)
    {
        super(name,age);
        this.roll=roll;
        this.marks=marks;
    }

    void  show()
    {
        System.out.println(name +" "+ age+" "+roll+" "+marks);
    }
}

public class abstract02
{
    public static void main(String []args)
    {
        suaysh s= new suaysh("vishwas", 18, 100, 100);
        s.show();
    }
    
}
