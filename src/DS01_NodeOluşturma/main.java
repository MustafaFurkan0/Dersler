package DS01_NodeOluşturma;

public class main {

    public static void main(String[] args) {

        Node A = new Node();    //Bellekte düğüm oluşturduk
        Node B = new Node();
        Node C = new Node();

        A.number = 11;      //Düğümlere değerler atıyoruz
        B.number = 22;
        C.number = 33;

        A.next = B;         //Düğümleri birbirine bağladık
        B.next = C;
        C.next = null;

        Node temp = A;

        while (temp != null) {      //Düğümlerin üzerinde dolaştık
            System.out.println(temp.number);
            temp = temp.next;

        }
    }
}
