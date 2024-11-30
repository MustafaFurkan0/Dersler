package DS14_HashTable;

public class Hash {

    Node hash[];
    int size;

    public Hash(int size) {
        this.size = size;
        hash = new Node[size];
        for (int i = 0; i < size; i++) {
            hash[i] = new Node();
        }
    }

    int indexProduce(int key) {
        return key % size;
    }

    void add(int key, String name) {

        int index = indexProduce(key);
        Node temp = hash[index];
        Node element = new Node(key, name);

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = element;
        System.out.println(element.name + " add hash table!!");
    }

    void delete(int key) {
        int index = indexProduce(key);
        Node temp = hash[index];
        Node temp2 = hash[index];

        if (temp.next == null) {
            System.out.println(key + " not found Hash");
        } else if (temp.next.key == key && temp.next.next == null) {
            System.out.println(temp.next.name + " the last element in the hash table is deleted");
            temp.next = null;
        } else {
            while (temp.next != null) {

                temp2 = temp;
                temp = temp.next;

                if (temp.key == key) {
                    System.out.println(temp.name + " deleted");
                    temp2.next = temp.next;
                }
            }
        }
        return;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            Node temp = hash[i];
            System.out.print("Array [" + i + "] -> ");
            if (temp.next != null) {
                while (temp.next != null) {
                    System.out.print(temp.next.key + " - " + temp.next.name + " -> ");
                    temp = temp.next;
                }

            }
            System.out.println("");
        }

    }

}
