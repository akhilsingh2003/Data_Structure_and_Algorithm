package Sorting;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array :");
        int n=sc.nextInt();
        int i,j,temp,loc;
        int [] arr=new int[n];
        System.out.println("enter the element");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("input array");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<n-1;i++){
            loc=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[loc]){
                    loc=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[loc];
            arr[loc]=temp;
        }
        System.out.println("\nSorted array");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
