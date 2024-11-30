package DS12_Tree_BinarySearch;

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

        System.out.print("preOrder : ");
        btree.preOrder(btree.root);
        System.out.println("");

        System.out.print("inOrder  : ");    //küçükten büyüğe sıralar
        btree.inOrder(btree.root);
        System.out.println("");

        System.out.print("postOrder: ");
        btree.postOrder(btree.root);
        System.out.println("");

        System.out.println("\nHeight Tree: " + btree.height(btree.root));

        System.out.println("Element Number Tree: " + btree.size(btree.root));
    }

}
