public class generic {
    public <T> void disp( T arr[])
    {
        System.out.println("this array has following elements : ");
        for (T ele:arr)
        {
            System.out.println(ele);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Integer num[]=new Integer[]{23,45,67,88,55};
        String names[]=new String[]{"ani","chi","ana"};
        Double numd[]=new Double[]{23.56,466.55,46.543};
        generic first=new generic();
        generic second =new generic();
        generic third =new generic();
        first.disp(num);
        second.disp(names);
        third.disp(numd);
    }
}
