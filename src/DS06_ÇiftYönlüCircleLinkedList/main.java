package DS06_ÇiftYönlüCircleLinkedList;

import java.util.*;

public class main {

    public static void main(String[] args) {

        CircleLinkedList list = new CircleLinkedList();
        Scanner input = new Scanner(System.in);
        String q1 = "";
        while (q1 != "q") {

            System.out.println("1: Add 'Head' of list");
            System.out.println("2: Add 'Tail' of list");
            System.out.println("3: Add 'Between' of list");
            System.out.println("4: Delete 'Head' of list");
            System.out.println("5: Delete 'Tail' of list");
            System.out.println("6: Delete 'Between' of list");
            System.out.println("8: Print the List in Reverse");
            System.out.println("9: Quit");

            System.out.print("\nEnter the number of the action you want: ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Add to the Head of list: ");
                    int x = input.nextInt();
                    list.addHead(x);
                    list.printHead();
                    break;
                case 2:
                    System.out.print("Add to the Tail of list: ");
                    int x1 = input.nextInt();
                    list.addTail(x1);
                    list.printHead();
                    break;
                case 3:
                    System.out.print("Enter index number: ");
                    int index = input.nextInt();
                    System.out.print("Enter the number you want to add: ");
                    int x3 = input.nextInt();
                    list.addBetween(index, x3);
                    list.printHead();
                    break;
                case 4:
                    list.deleteHead();
                    list.printHead();
                    break;
                case 5:
                    list.deleteTail();
                    list.printHead();
                    break;
                case 6:
                    System.out.print("Enter index number: ");
                    int index1 = input.nextInt();
                    list.deleteBetween(index1);
                    list.printHead();
                    break;
                case 8:
                    list.printReverse();
                    break;
                case 9:
                    q1 = "q";
                    list.printHead();
                    System.out.println("");
                    list.printReverse();
            }
        }
    }
}
