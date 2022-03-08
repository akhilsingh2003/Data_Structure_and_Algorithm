package recursion;

public class reverse_linkedlist
{
    Node head;
    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printReverse(Node head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String args[])
    {
        reverse_linkedlist llist = new reverse_linkedlist();
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        llist.printReverse(llist.head);
    }

}