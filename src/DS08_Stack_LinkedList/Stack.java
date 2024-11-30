package DS08_Stack_LinkedList;

public class Stack {

    int size;
    int counter;
    Node top;

    public Stack(int size) {
        this.size = size;
        counter = 0;
        top = null;
    }

    void push(int data) {

        Node element = new Node(data);

        if (isFull()) {
            System.out.println("Stack is Full !!");
        } else {
            if (isEmpty()) {
                top = element;
                System.out.println("Push: " + top.data);
            } else {
                element.next = top;
                top = element;
                System.out.println("Push: " + top.data);
            }
            counter++;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !!");
        } else {
            System.out.println("Pop: " + top.data);
            top = top.next;
            counter--;
        }
    }

    void print() {

        if (isEmpty()) {
            System.out.println("Stack Empty, nothing found to print");
        } else {
            Node temp = top;
            System.out.println("****************");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("****************");
        }
    }

    void showTop() {
        if (isEmpty()) {
            System.out.println("Stack Empty ");
        } else {
            System.out.println("Top data: " + top.data);
        }
    }

    boolean isFull() {
        return (counter == size);
    }

    boolean isEmpty() {
        return (counter == 0);
    }

}
