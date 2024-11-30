package DS13_Tree_Delete;

public class main {

    public static void main(String[] args) {

        Tree btree = new Tree();

        btree.root = btree.insert(btree.root, 10);
        btree.root = btree.insert(btree.root, 15);
        btree.root = btree.insert(btree.root, 20);
        btree.root = btree.insert(btree.root, 8);
        btree.root = btree.insert(btree.root, 5);
        btree.root = btree.insert(btree.root, 9);
        btree.root = btree.insert(btree.root, 12);
        btree.root = btree.insert(btree.root, 25);

        btree.inOrder(btree.root);  //küçükten büyüğe sıralar

        System.out.println("\nRoot Value: " + btree.root.data);

        btree.root = btree.delete(btree.root, 10);

        System.out.println("After Delete");

        btree.inOrder(btree.root);

        System.out.println("\nRoot Value: " + btree.root.data);
    }

}
