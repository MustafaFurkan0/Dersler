package DS02_LinkedListGenelYapısı;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int quit = 0;
        System.out.println("** To exit, type -1 **");

        while (quit != -1) {

            System.out.print("Add number to list: ");
            int x = input.nextInt();
            if (x == -1) {
                list.print();    
                quit = -1;
                break;
            } else {
                list.addList(x);
            }
        }
    }

}
