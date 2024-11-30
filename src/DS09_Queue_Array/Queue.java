package DS09_Queue_Array;

public class Queue {

    int size;
    int array[];
    int front;
    int rear;

    public Queue(int size) {
        this.size = size;
        array = new int[size];
        front = 0;
        rear = -1;
    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full !!");
        } else {
            rear++;
            array[rear] = data;
            System.out.println("EnQueue: " + array[rear]);
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty !!");
        } else {
            int temp = array[front];
            for (int i = 1; i <= rear; i++) {
                array[i - 1] = array[i];
            }
            rear--;
            System.out.println("DeQueue: " + temp);
        }
    }

    void nbrElement() {
        System.out.println("Number of Element: " + (rear + 1));
    }

    void print() {

        int i = rear;
        System.out.print("End -> ");
        while (i >= 0) {
            System.out.print(array[i] + " -> ");
            i--;
        }
        System.out.println(" Head");
    }

    boolean isFull() {
        return (rear == (size - 1));
    }

    boolean isEmpty() {
        return (rear == -1);
    }

}
