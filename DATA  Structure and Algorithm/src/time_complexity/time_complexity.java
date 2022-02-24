package time_complexity;

public class time_complexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        time_complexity demo= new time_complexity();
        System.out.println(demo.findsum(99999));

        System.out.println("time taken "+(System.currentTimeMillis()-now)+" millisecs.");
    }

    public int findsum(int n){
        return n*(n+1)/2;
    }

//    public int findsum(int n){
//        int sum = 0;
//        for(int i = 1; i <= n; i++)
//        {
//            sum = sum + i;
//        }
//        return sum;
//    }
}
