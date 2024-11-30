package DS06_ÇiftYönlüCircleLinkedList;

public class CircleLinkedList {

    Node head = null;
    Node tail = null;

    void addHead(int data) {
        Node element = new Node(data);
        if (head == null) {
            head = element;
            tail = element;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        } else {
            element.next = head;
            head.prev = element;
            head = element;
            head.prev = tail;
            tail.next = head;
        }
    }

    void addTail(int data) {
        Node element = new Node(data);
        if (head == null) {
            head = element;
            tail = element;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        } else {
            element.prev = tail;
            tail.next = element;
            tail = element;
            tail.next = head;
            head.prev = tail;
        }
    }

    void addBetween(int index, int data) {
        Node element = new Node(data);
        if (head == null && index == 0) {
            head = element;
            tail = element;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        } else if (head != null && index == 0) {
            element.next = head;
            head.prev = element;
            head = element;
            head.prev = tail;
            tail.next = head;
        } else {
            int n = 0;
            Node temp = head;
            while (temp.next != head) {
                n++;
                temp = temp.next;
            }
            if (index > n) {
                element.prev = tail;
                tail.next = element;
                tail = element;
                tail.next = head;
                head.prev = tail;
            } else {
                int i = 0;
                temp = head;
                while (i != index) {
                    i++;
                    temp = temp.next;
                }
                element.prev = temp.prev;
                temp.prev.next = element;
                element.next = temp;
                temp.prev = element;
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
            head.prev = tail;
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
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    void deleteBetween(int index) {
        if (head == null) {
            System.out.println("The List is Empty !!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else if (head != null && index == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        } else {

            Node temp = head;
            int n = 0;
            while (temp.next != head) {
                temp = temp.next;
                n++;
            }
            if (index >= n) {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            } else {
                temp = head;
                int i = 0;
                while (i != index) {
                    temp = temp.next;
                    i++;
                }
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
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

    void printReverse() {
        if (head == null) {
            System.out.println("The list is empty !!");
        } else {
            Node temp = tail;
            System.out.print("\nList --> Tail ");
            while (temp != head) {
                System.out.print(temp.data + " -> ");
                temp = temp.prev;
            }
            System.out.println(temp.data + " Tail\n");
        }
    }

}
