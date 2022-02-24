package Linked_list;

public class singly_midnode {
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
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");

    }
    public Node getmiddleNode(Node head){
        if(singly_midnode.head == null) {
            return null;
        }
        Node slowPtr = singly_midnode.head;
        Node fastPtr = singly_midnode.head;

        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args){
        singly_midnode mdn = new singly_midnode();
        mdn.head = new Node(10);
        Node second = new Node(12);
        Node third = new Node(86);
        Node forth = new Node(35);

        head.next = second;
        second.next = third;
        third.next = forth;

        Node middleNode = mdn.getmiddleNode(mdn.head);
        System.out.println(middleNode.data);


    }
}