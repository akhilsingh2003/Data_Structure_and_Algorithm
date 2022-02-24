package Linked_list;

public class reverse_singly_linkedlist {
    public static Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void traverse(Node head) {
        Node current_node = head;
        while (current_node != null) {
            System.out.print(current_node.data + "--->");
            current_node = current_node.next;
        }

    }

    public Node Reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node current_node=head;
        Node previous=null;
        Node next =null;
        while(current_node!=null){
            next=current_node.next;
            current_node.next=previous;
            previous=current_node;
            current_node=next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node second =new Node(12);
        Node third =new Node(86);
        Node forth =new Node(35);

        head.next=second;
        second.next=third;
        third.next=forth;

        reverse_singly_linkedlist slst=new reverse_singly_linkedlist();
        slst.traverse(head);
        Node reverselisthead=slst.Reverse(head);
        System.out.println(" ");
        slst.traverse(reverselisthead);

    }
}