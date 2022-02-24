package Linked_list;
//circular singly linkedlist

import java.util.NoSuchElementException;

public class circular_linked_list {
     Node last;
     int length;
     public class Node{
         Node next;
         int data;
         public Node(int data){
             this.data=data;
         }
     }
     public circular_linked_list(){
         last =null;
         length=0;
     }
     public int length(){
         return length;
     }
     public boolean isEmpty(){
         return length==0;
     }
     public void traverse(){
         if(last==null){
             return ;
         }
     Node frist = last.next;
         while(frist != last){
             System.out.print(frist.data+" ");
             frist=frist.next;
         }
     System.out.println(frist.data+" ");
     }

     public void insert_begining(int data)
     {
         Node temp=new Node(data);
        if(last==null){
            last =temp;
        }else{
            temp.next=last.next;
        }
        last.next =temp;
        length++;
     }
     public void insert_last(int data){
         Node temp=new Node(data);
         if(last ==null){
             last=temp;
             last.next=last;
         }else{
             temp.next=last.next;
             last.next=temp;
             last=temp;
         }
         length++;
     }
     public Node delete_frist(){
         if(isEmpty())
             throw new NoSuchElementException();
         Node temp= last.next;
         if(last.next==last){
             last=null;
         }else{
             last.next=temp.next;
         }
         temp.next=null;
         length--;
         return temp;
     }

    public static void main(String[] args) {
         circular_linked_list clst=new circular_linked_list();
         clst.insert_begining(23);
         clst.insert_begining(789);
         clst.insert_begining(875);
         clst.insert_begining(879);
         clst.insert_begining(574);
         clst.insert_last(890);
         clst.delete_frist();
         clst.traverse();


    }
}
