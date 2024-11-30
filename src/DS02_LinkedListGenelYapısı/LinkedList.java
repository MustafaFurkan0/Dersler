package DS02_LinkedListGenelYapısı;

public class LinkedList {

    Node head = null;
    Node tail = null;

    void addList(int x) {

        Node element = new Node();  //Eklenecek olan düğüm(obje)
        element.data = x;
        element.next = null;

        if (head == null) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;         //Son düğümü güncelledim
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
