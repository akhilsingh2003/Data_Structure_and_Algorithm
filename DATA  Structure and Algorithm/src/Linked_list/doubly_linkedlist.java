package Linked_list;

import java.util.NoSuchElementException;

public class doubly_linkedlist {
    Node head;
    Node tail;
    int length;

    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data){
            this.data =data;

        }
    }
    public doubly_linkedlist(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty()
    {
        return length==0;//head==null
    }
    public int length(){
        return length;
    }
    public void traverseForwrd(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" --->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void traverseBackwrd(){
        if(tail==null){
            return;
        }
        Node temp=tail;
            while(temp!=null){
                System.out.print(temp.data +" --->");
                temp=temp.previous;
            }
            System.out.println("null");
        }
    public void insert_begining(int data){
        Node new_node =new Node(data);
        if(isEmpty()){
            tail=new_node;
        }else{
            head.previous=new_node;
        }
        new_node.next=head;
        head=new_node;
        length++;
    }
    public void insert_last(int data){
        Node new_node=new Node(data);
        if(isEmpty()){
            head=new_node;
        }else{
            tail.next=new_node;
            new_node.previous=tail;
        }
        tail=new_node;
    }
    public Node delete_frist(){
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        Node temp=head;
        if(head == tail){
            tail=null;
        }else
        {
            head.next.previous=null;
        }
        head =head.next;
        temp.next=null;
        length--;
        return temp;
    }
    public Node delete_last(){
        if(isEmpty());
        Node temp= tail;
        if(head==tail){
            head=null;
        }else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        return temp;
    }

    public static void main(String[] args) {
        doubly_linkedlist dlst=new doubly_linkedlist();
        dlst.insert_begining(23);
        dlst.insert_begining(43);
        dlst.insert_begining(89);
        dlst.insert_begining(84);
        dlst.insert_last(879);
        dlst.delete_frist();
        dlst.delete_last();
        dlst.traverseForwrd();
        dlst.traverseBackwrd();
    }
}
