class threaddemo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");
        }
    }
}

public class thread01
{
    public static void main(String [] args)
    {
         threaddemo t=new threaddemo();//thread created by main thread
         t.start();//calls the start method in the thread

         for(int i=0;i<10;i++)
         {
            System.out.println("main thread");
         }

    }
    
}
