package Stack;

import java.util.Scanner;

/* Java program to implement basic stack
operations */
class Stack {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int top;

    Stack() {

        top = -1;
    }

    boolean isEmpty() {

        return (top < 0);
    }

    boolean push(int x) {
        if (top >= (n - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

// Driver code
public class stack_implementation {
    public static void main(String args[]) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of stack : ");
//        int n = sc.nextInt();
        while (true) {
            System.out.println("\nPress 1 for Push");
            System.out.println("Press 2 for Pop");
            System.out.println("Press 3 for Peek");
            System.out.println("Press 4 for print");
            System.out.println("Press 5 for Exit");

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.print();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }

        }
    }
}