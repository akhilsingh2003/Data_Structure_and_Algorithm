package Searching;

import java.util.Scanner;

public class BInary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array :");
        int n=sc.nextInt();
        int c=0;
        int i;
        int [] arr=new int[n];
        System.out.println("enter the element");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to Search : ");
        int item= sc.nextInt();
        int beg,end,mid=0;
        beg=0;end=n-1;
        while(beg<=end){
            mid=(beg+end)/2;
            if(item== arr[mid]){
                c++;
                break;
            }
            else if(item>arr[mid])
            {
                beg=mid+1;
            }
            else if (item<arr[mid]){
                end=mid-1;
            }
        }
        if(c>0){
            System.out.println("item found at "+mid);
        }
        else{
            System.out.println("item does not found");
        }
    }
}
