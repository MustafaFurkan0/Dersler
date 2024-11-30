package DS10_Queue_LinkedList;

public class Queue {

    Node front;
    Node rear;
    int size;
    int counter;

    public Queue(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;
    }

    void enQueue(int data) {
        Node element = new Node(data);
        if (isFull()) {
            System.out.println("Queue is Full !!");
        } else {
            if (isEmpty()) {
                front = element;
                rear = element;
                System.out.println("EnQueue: " + data);
            } else {
                rear.next = element;
                rear = element;
                System.out.println("EnQueue: " + data);
            }
            counter++;
        }

    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty !!");
        } else {
            System.out.println("DeQueue: " + front.data);
            front = front.next;
            counter--;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty !!");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    boolean isEmpty() {
        return (counter == 0);
    }

    boolean isFull() {
        return counter == size;
    }
}
