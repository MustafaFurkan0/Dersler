package DS07_Stack_Array;

public class main {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        
        System.out.println("");

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
    }

}
