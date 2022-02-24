class firsts extends Thread
{
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("First "+i);
            System.out.println(getName());
        }
    }
}
class seccondd extends Thread
{

    public void run()
    {
        for(int j=0;j<20;j++)
        {
            System.out.println("SECOND "+ j);
            System.out.println(getName());
        }
    }
}
public class thread_extend {
    public static void main(String[] args) {
        firsts f = new firsts();
        seccondd s = new seccondd();
        f.start();
        s.start();
    }
}
