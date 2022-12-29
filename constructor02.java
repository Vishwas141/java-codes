/*
-----------------------------valid-----------------------------------
class parent
{
    parent()
    {

    }
}
class child extends parent
{
    child()
    {

    }
}



*/
/* 
------------------------error--------------------------------------
class parent
{
    parent(int i)
    {

    }
}
class child extends parent
{
    child()
    {

    }
}
*/
/* 
------------------------valid-------------------------------
class parent
{
    parent(int i)
    {

    }
}
class child extends parent
{
    child(int a,int b)
    {
              super(a);//sending a value to the parent constructor
    }
}
*/
 
/*---------------------valid---------------------------------------*/
class parent
{
    parent()
    {

    }
}
class child extends parent
{
    child(int a)
    {

    }
}





public class constructor02 
{
    public static void main(String []args)
    {
        child c=new child(10);

    }
}
