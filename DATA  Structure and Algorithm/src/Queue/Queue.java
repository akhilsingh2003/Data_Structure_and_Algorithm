package Queue;

import java.util.NoSuchElementException;
import java.util.zip.ZipInputStream;

public class Queue {
     Node front;
     Node rear;
     int length;
     public class Node{
         int data;
         Node next;
         public Node(int data){
             this.data=data;
             this.next=null;
         }
     }
     public int length(){
         return length;
     }
     public boolean isEmpty(){
         return length ==0;
     }
     public void traverse(){
         if(isEmpty()){
             return;
         }
         Node current=front;
         while(current!=null){
             System.out.print(current.data+" ---> ");
             current=current.next;
         }
         System.out.println("null");

     }
     public void enqueue(int data){
         Node temp= new Node(data);
         if(isEmpty()){
             front=temp;
         }else{
             rear.next=temp;
         }
         rear=temp;
         length++;
     }
     public int dequeue(){
         if(isEmpty()){
             throw new NoSuchElementException();
         }
         int result=front.data;
         front=front.next;
         if(front==null){
             rear=null;
         }
         length--;
         return result;
     }

    public static void main(String[] args) {
         Queue qlst=new Queue();
         qlst.enqueue(23);
         qlst.enqueue(56);
         qlst.enqueue(98);
         qlst.enqueue(88);
         qlst.enqueue(34);
        System.out.println("queue before removing");
        qlst.traverse();
        qlst.dequeue();
        System.out.println("queue after the removing");
        qlst.traverse();


    }
}
