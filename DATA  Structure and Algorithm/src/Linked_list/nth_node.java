package Linked_list;

public class nth_node {
    public static Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void traverse() {
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

        }
    public Node getNthNodeFromEnd(int n) {
        if(head == null) {
            return null;
        }

        if(n <= 0) {
            throw new IllegalArgumentException("Invalid value: n = " + n);
        }

        Node mainPtr = head;
        Node refPtr = head;

        int count = 0;

        while(count < n) {
            if(refPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }

        while(refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }



    public static void main(String[] args){
        Node head = new Node(10);
        Node second = new Node(12);
        Node third = new Node(86);
        Node forth = new Node(35);

        head.next = second;
        second.next = third;
        third.next = forth;
        nth_node ntd=new nth_node();

        ntd.traverse();
//        Node nthnode=ntd.nthnode(-1);
//        System.out.println("nth node is from the end is  : "+nthnode.data);


    }
}