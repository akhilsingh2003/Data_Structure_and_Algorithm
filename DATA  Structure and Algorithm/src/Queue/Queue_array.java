package Queue;

public class  Queue_array {
     int front, rear, capacity;
     int queue[];

    public Queue_array(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public  void queueEnqueue(int data)
    {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        }
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    public void queueDequeue()
    {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
        return;
    }
    public  void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    public  void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }

    public static void main(String[] args)
    {
        Queue_array q = new Queue_array(4);
        q.queueDisplay();
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);
        q.queueDisplay();
        q.queueEnqueue(60);
        q.queueDisplay();
        q.queueDequeue();
        q.queueDequeue();
        System.out.printf("\n\nafter two node deletion\n\n");
        q.queueDisplay();
        q.queueFront();
    }
}
