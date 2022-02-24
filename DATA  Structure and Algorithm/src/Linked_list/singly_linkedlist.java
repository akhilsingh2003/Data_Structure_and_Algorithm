package Linked_list;

public class singly_linkedlist {
    public static Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void traverse()
    {
        Node  current_node=head;
        while(current_node!=null)
        {
            System.out.print(current_node.data +"--->");
            current_node=current_node.next;
        }

    }
    public int length()
    {
        if(head== null)
        {
            return 0;
        }
        int count=0;
        Node current_node=head;
        while(current_node!=null)
        {
            count++;
            current_node=current_node.next;
        }
        return count;
    }
    public void insert_begining(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public void insert_end(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node current_node = head;
        while (null != current_node.next) {
            current_node = current_node.next;

        }
        current_node.next=new_node;
    }
    public void insert_at(int position,int data){
        Node new_node=new Node(data);
        if(position==1){
            new_node.next=head;
            head=new_node;
        }
        else{
            Node previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            Node current_node=previous.next;
            new_node.next=current_node;
            previous.next=new_node;
        }
    }
    public Node delete_first(){
        if (head==null)
        {
            return null;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }
    public Node delete_last()
    {
        if(head==null || head.next==null){
            return head;
        }
        Node current_node=head;
        Node previous=null;
        while(current_node.next != null){
            previous=current_node;
            current_node=current_node.next;
        }
        previous.next=null;
        return current_node;
    }
    public void Delete_at(int position) {
        Node previous = null;
        if (position == 1) {
            head = head.next;
        } else {
            previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current_node = previous.next;
            count++;
        }
        Node current_node = previous.next;
        previous.next=current_node.next;
    }
    public boolean search(Node head, int key)
    {
        if(head == null)
        {
            return false;
        }
        Node current_node=head;
        while(current_node!=null)
        {
            if(current_node.data==key)
            {
                return true;
            }
            current_node=current_node.next;
        }
        return false;
    }


    public static void main(String[] args) {
        singly_linkedlist slst=new singly_linkedlist();
        slst.head=new Node(12);
        Node second = new Node(13);
        Node third = new Node(14);
        Node forth =new Node(15);

        slst.head.next=second;
        second.next=third;
        third.next=forth;
        slst.insert_begining(122);
        slst.insert_begining(57);
        slst.insert_end(234);
        slst.insert_at(3,456);
        slst.delete_first();
        slst.delete_last();
       // slst.Delete_at(3);
        slst.traverse();
        System.out.println("\nlength is : "+slst.length());
        if(slst.search(head, 13))
        {
            System.out.println("element found");
        }
        else
        {
            System.out.println("not found");
        }

    }
}

