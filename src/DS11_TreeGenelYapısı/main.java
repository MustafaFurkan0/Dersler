package DS11_TreeGenelYapısı;

public class main {

    public static void main(String[] args) {

        BinaryTree btree = new BinaryTree();

        btree.root = btree.insert(btree.root, 10);
        btree.root = btree.insert(btree.root, 15);
        btree.root = btree.insert(btree.root, 8);
        btree.root = btree.insert(btree.root, 20);
        btree.root = btree.insert(btree.root, 4);
        btree.root = btree.insert(btree.root, 12);

        System.out.println("Root Data: " + btree.root.data);
        System.out.println("Root Solundaki Data: " + btree.root.left.data);
        System.out.println("Root Sağındaki Data: " + btree.root.right.data);
        System.out.println("Root Solunun Solunun Data: " + btree.root.left.left.data);
        System.out.println("Root Sağının Sağı Data: " + btree.root.right.right.data);
        System.out.println("Root Sağının Solu Data: " + btree.root.right.left.data);
        
    }

}
