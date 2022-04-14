package Sorting;
import java.util.Scanner;
public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array :");
        int n=sc.nextInt();
        int i,j,temp;
        int [] arr=new int[n];
        System.out.println("enter the element");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("input array");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(i=1;i<=n-1;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && temp<arr[j])
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        System.out.println("\nSorted array");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
