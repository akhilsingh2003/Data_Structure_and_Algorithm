class Sampledemo implements Runnable
{
    private Thread t;
    private String threadname;

    Sampledemo( String threadname)
    {
        this.threadname =threadname;
    }

    @Override
    public void run() {
        while(true)
            System.out.println(threadname);
    }
    public void start()
    {
        if(t==null)
        {
            t=new Thread(this,threadname);
            t.start();
        }
    }
}

public class qua {
    public static void main(String[] args) {
        Sampledemo A= new Sampledemo("A");
        Sampledemo B=new Sampledemo("B");

        B.start();
        A.start();
    }
}
