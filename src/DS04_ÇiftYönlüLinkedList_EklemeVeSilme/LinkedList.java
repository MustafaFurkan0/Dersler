package DS04_ÇiftYönlüLinkedList_EklemeVeSilme;

public class LinkedList {

    Node head = null;
    Node tail = null;

    void addHead(int data) {
        Node element = new Node(data);
        if (head == null) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head.prev = element;
            head = element;
        }
    }

    void addTail(int data) {
        Node element = new Node(data);
        if (head == null) {
            head = element;
            tail = element;
        } else {
            element.prev = tail;
            tail.next = element;
            element.next = null;
            tail = element;
        }
    }

    void addBetween(int index, int data) {
        Node element = new Node(data);

        if (head == null) {
            head = element;
            tail = element;
        } else if (head != null && index == 0) {
            element.next = head;
            head.prev = element;
            head = element;
        } else {
            Node temp = head;
            int n = 0;
            while (temp.next != null) {
                n++;
                temp = temp.next;
            }
            temp = head;
            if (index > n) {
                tail.next = element;
                element.prev = tail;
                tail = element;
                element.next = null;
            } else {

                int i = 0;
                while (i != index) {
                    i++;
                    temp = temp.next;
                }
                temp.prev.next = element;
                element.prev = temp.prev;
                element.next = temp;
                temp.prev = element;

            }
        }

    }

    void deleteHead() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    void deleteTail() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    void deleteBetween(int index) {
        if (head != null) {
            if (head.next == null && index <= 0) {
                head = null;
                tail = null;
            } else if (head.next != null && index <= 0) {
                head = head.next;
                head.prev = null;
            } else {
                int n = 0;
                Node temp = head;
                while (temp != null) {
                    n++;
                    temp = temp.next;
                }
                if (index >= (n - 1)) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp = head;
                    int i = 0;
                    while (i < index) {
                        i++;
                        temp = temp.next;
                    }
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                }
            }
        }
    }

    void printHead() {
        if (head == null) {
            System.out.println("The list is empty !!");
        } else {
            Node temp = head;
            System.out.print("\nList --> Head ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Tail\n");
        }
    }

    void printReverse() {
        if (head == null) {
            System.out.println("The list is empty !!");
        } else {
            Node temp = tail;
            System.out.print("\nList --> Tail ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.prev;
            }
            System.out.println("Head");
        }
    }
}
