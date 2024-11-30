package DS05_TekYönlüCircleLinkedList;

public class CircleLinkedList {

    Node head = null;
    Node tail = null;

    void addHead(int data) {
        Node element = new Node(data);
        if (head == null) {
            head = element;
            tail = element;
            tail.next = head;
        } else {

            element.next = head;
            head = element;
            tail.next = head;
        }
    }

    void addTail(int data) {
        Node element = new Node(data);
        if (head == null) {
            head = element;
            tail = element;
            tail.next = head;
        } else {

            tail.next = element;
            tail = element;
            tail.next = head;
        }
    }

    void addBetween(int index, int data) {
        Node element = new Node(data);
        if (head == null) {
            head = element;
            tail = element;
            tail.next = head;
        } else if (index == 0) {
            element.next = head;
            head = element;
            tail.next = head;
        } else {
            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp != tail) {
                n++;
                temp = temp.next;
            }
            n++;
            if (index > (n - 1)) {

                tail.next = element;
                tail = element;
                tail.next = head;
            } else {
                temp = head;
                temp2 = head;
                int i = 0;
                while (i < index) {
                    i++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = element;
                element.next = temp;
            }
        }
    }

    void deleteHead() {
        if (head == null) {
            System.out.println("The List is Empty !!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    void deleteTail() {
        if (head == null) {
            System.out.println("The List is Empty !!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        }
    }

    void deleteBetween(int index) {
        if (head == null) {
            System.out.println("The List is Empty !!");
        } else if (head == tail && index == 0) {
            head = null;
            tail = null;
        } else if (head != tail && index == 0) {
            head = head.next;
            tail.next = head;
        } else {
            Node temp = head;
            int n = 0;
            while (temp.next != tail) {
                n++;
                temp = temp.next;
            }
            if (index > n) {
                tail = temp;
                tail.next = head;
            } else {
                Node temp2 = head;
                temp = head;
                int i = 0;
                while (i != index) {
                    i++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;
            }
        }
    }

    void printHead() {
        if (head == null) {
            System.out.println("The list is empty !!");
        } else {
            Node temp = head;
            System.out.print("\nList --> Head ");
            while (temp != tail) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data + " Tail\n");
        }
    }

}
