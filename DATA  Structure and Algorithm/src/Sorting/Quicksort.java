package Sorting;
import java.util.Scanner;
class quicksort{
    int partition(int arr[],int start,int end){
        int pivot=arr[end];
        int pindex=start;
        for(int i=start;i<end-1;i++){
            if(arr[i]<=pivot){
                int t=arr[pindex];
                arr[pindex]=arr[i];
                arr[i]=t;
                pindex++;
            }
            else{
                i++;
            }
        }
        int t=arr[pindex];
        arr[pindex]=arr[end];
        arr[end]=t;
        return(pindex);
    }
    void quicksort(int arr[],int start,int end)
    {
        if(start < end){
            int p=partition(arr,start,end);
            quicksort(arr,start,p-1);
            quicksort(arr,p+1,end);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array :");
        int n=sc.nextInt();
        int i;
        int [] arr=new int[n];
        System.out.println("enter the element");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("input array");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        quicksort q=new quicksort();
        q.quicksort(arr,0,n-1);
        System.out.println("\nSorted array");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
