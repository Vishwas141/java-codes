class threaddemo extends Thread
{
    //we can able to overload the run method but start method only call the run method with no argument 
    /*public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");
        }
    }
*/

    public void run(int i)
    {
        System.out.println("normal int argument run method");
    }
}

public class thread02
{
    public static void main(String [] args)
    {
         threaddemo t=new threaddemo();//thread created by main thread
         t.start();//calls the start method in the thread 

         for(int i=0;i<10;i++)
         {
            System.out.println("main thread");
         }
         t.run(1);

    }
    
}

