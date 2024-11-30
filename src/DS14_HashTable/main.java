package DS14_HashTable;

public class main {

    public static void main(String[] args) {

        Hash hash = new Hash(5);
        hash.add(16, "Emine");
        hash.add(55, "Mustafa");
        hash.add(13, "Ali");
        hash.add(37, "Hamza");
        hash.add(24, "Hasan");
        hash.add(20, "Halil");
        hash.add(32, "Taşkın");
        
        hash.delete(13);

        hash.print();
    }

}
