package Sorting;

import java.util.Scanner;

public class Merge {
    void merge1(int arr[],int start ,int mid , int end){
        int lf=mid -start +1;
        int rf=end -mid;
        int left_subarray[]=new int[lf];
        int right_subarray []=new int[rf];

        for(int i=0;i<lf;++i)
            left_subarray[i]=arr[start+i];
        for(int j=0;j<rf;++j)
            right_subarray[j]=arr[mid+1+j];

        int i=0, j=0;
        int k=start;
        while(i<lf && j<rf){
            if(left_subarray[i]<=right_subarray[j]){
                arr[k]=left_subarray[i];
                i++;
            }
            else{
                arr[k]=right_subarray[j];
                j++;
            }
            k++;
        }
        while(i < lf){
            arr[k]=left_subarray[i];
            i++;
            k++;
        }
        while(j<rf){
            arr[k]=right_subarray[j];
            j++;
            k++;
        }

        }
        void mergesort(int arr[],int start ,int end){
        if(start<end){
            int mid =(start+end)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge1(arr,start,mid,end);
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
        Merge m=new Merge();
        m.mergesort(arr,0,n-1);
        System.out.println("\nSorted array");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    }

