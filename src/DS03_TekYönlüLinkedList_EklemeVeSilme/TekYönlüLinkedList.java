package DS03_TekYönlüLinkedList_EklemeVeSilme;

public class TekYönlüLinkedList {

    Node head = null;
    Node tail = null;

    void addList(int x) {

        Node element = new Node();
        element.data = x;
        element.next = null;
        if (head == null) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
        }
    }

    void addHead(int x) {

        Node element = new Node();
        element.data = x;
        element.next = null;
        if (head == null) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head = element;
        }
    }

    void addBetween(int index, int x) {

        Node element = new Node();
        element.data = x;
        element.next = null;

        if (head == null && index == 0) {
            head = element;
            tail = element;
        } else if (head != null && index == 0) {
            element.next = head;
            head = element;
            System.out.println(index + ".indexe eleman eklendi.");
        } else {
            int n = 0;
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                n++;
                temp2 = temp;
                temp = temp.next;
            }
            if (n == index) {
                element.next = temp;
                temp2.next = element;
                System.out.println(index + ".indexe eleman eklendi.");
            } else {

                temp = head;
                temp2 = head;
                int i = 0;
                while (i < index) {
                    i++;
                    temp2 = temp;
                    temp = temp.next;

                }
                element.next = temp;
                temp2.next = element;
                System.out.println(index + ".indexe eleman eklendi.");
            }
        }
    }

    void addTail(int x) {

        Node element = new Node();
        element.data = x;
        element.next = null;
        if (head == null) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
            element.next = null;
        }
    }

    void deleteHead() {
        if (head == null) {
            System.out.println("The List is Empty !!");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    void deleteBetween(int index) {

        if (head == null) {
            System.out.println("The List is Empty !!");
        } else if (head.next == null && index == 0) {
            head = null;
            tail = null;
        } else if (head.next != null && index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            Node temp2 = head;
            int n = 0;
            while (temp.next != null) {
                n++;
                temp2 = temp;
                temp = temp.next;
            }
            if (n == index) {
                temp2.next = null;
                tail = temp2;
            } else {
                temp = head;
                temp2 = head;
                int j = 0;
                while (j != index) {
                    j++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;
            }
        }
    }

    void deleteTail() {
        if (head == null) {
            System.out.println("The List is Empty !!");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
        }
    }

    void print() {
        if (head == null) {
            System.out.println("The list is empty !!");
        } else {
            Node temp = head;
            System.out.print("\nList --> ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

}
