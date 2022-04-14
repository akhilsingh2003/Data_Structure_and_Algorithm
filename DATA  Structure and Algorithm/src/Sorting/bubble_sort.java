package Sorting;

import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array :");
        int n=sc.nextInt();
        int k;
        int i,temp;
        int [] arr=new int[n];
        System.out.println("enter the element");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("input array");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(i=0;i<n;i++){
            for(k=0;k<n-i-1;k++){
                if(arr[k]>arr[k+1]){
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.println("\nSorted array");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
