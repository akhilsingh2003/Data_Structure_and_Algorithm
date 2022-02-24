package Stack;

import java.util.EmptyStackException;

public class Stack_linkedList {

    Node top;
    int length;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack_linkedList() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack_linkedList stackLinkedList = new Stack_linkedList();
        stackLinkedList.push(10);
        stackLinkedList.push(15);
        stackLinkedList.push(20);
        System.out.println(stackLinkedList.peek());
        stackLinkedList.pop();
        System.out.println(stackLinkedList.peek());
        stackLinkedList.pop();
        System.out.println(stackLinkedList.peek());
    }
}