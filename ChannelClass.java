class change {
    private int channel;
    private int vol;
    public void get(int com,int v)
    {
        channel=com;
        vol=v;

    }

    public int changevolume() 
    {
        if (channel > 10)
            return 0;
        else
            return 15;
    }

    public int changechannel() {
        if (channel > 100)
            return 123;
        else
            return 10;
    }
}

public class ChannelClass 
{
    public static void main(String [] args) 
    {
       change c=new change();
       c.get(3,4);
       System.out.println(c.changechannel());
       System.out.println(c.changevolume());



    }

}