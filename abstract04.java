interface vishwas
{
    void m1();
    default void m2()
    {

    }
}

class child implements vishwas
{
    public void m1()
    {

    }
}

class abstract04
{
    public static void main(String [] args)
    {
        child c =new child();
        c.m2();
        c.m1();
    }
}