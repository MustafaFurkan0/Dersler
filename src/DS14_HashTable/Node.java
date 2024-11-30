package DS14_HashTable;

public class Node {

    int key;
    String name;
    Node next;

    public Node() {
        this.next = null;
    }

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
        this.next = null;
    }

}
