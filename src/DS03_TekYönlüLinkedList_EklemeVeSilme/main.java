package DS03_TekYönlüLinkedList_EklemeVeSilme;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        TekYönlüLinkedList list = new TekYönlüLinkedList();
        Scanner input = new Scanner(System.in);

        String q1 = "";
        while (q1 != "q") {
            System.out.println("\n1: Create list");
            System.out.println("2: Add 'Head' of list");
            System.out.println("3: Add 'Tail' of list");
            System.out.println("4: Add 'Between' of list");
            System.out.println("5: Delete 'Head' of list");
            System.out.println("6: Delete 'Tail' of list");
            System.out.println("7: Delete 'Between' of list");
            System.out.println("9: Quit");

            System.out.print("\nEnter the number of the action you want: ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Add number to list: ");
                    int x = input.nextInt();
                    list.addList(x);
                    list.print();
                    break;

                case 2:
                    System.out.print("Add to the Head of list: ");
                    int x1 = input.nextInt();
                    list.addHead(x1);
                    list.print();
                    break;
                case 3:
                    System.out.print("Add to the Tail of list: ");
                    int x2 = input.nextInt();
                    list.addTail(x2);
                    list.print();
                    break;
                case 4:
                    System.out.print("Enter index number: ");
                    int index = input.nextInt();
                    System.out.print("Enter the number you want to add: ");
                    int x3 = input.nextInt();
                    list.addBetween(index, x3);
                    list.print();
                    break;
                case 5:
                    list.deleteHead();
                    list.print();
                    break;
                case 6:
                    list.deleteTail();
                    list.print();
                    break;
                case 7:
                    System.out.print("Enter index number: ");
                    int index1 = input.nextInt();
                    list.deleteBetween(index1);
                    list.print();
                    break;
                case 9:
                    q1 = "q";
                    list.print();
            }

        }

    }

}
