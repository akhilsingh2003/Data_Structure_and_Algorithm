package Searching;

import java.util.Scanner;

public class LInear_searching {
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
        for( i=0;i<n;i++){
            if(arr[i]==item){
                c++;
                break;
            }

        }
        if(c>0){
            System.out.println("element is present at index no. "+i);
        }
        else{
            System.out.println("element does not present ");
        }
    }
}
