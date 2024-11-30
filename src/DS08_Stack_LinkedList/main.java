package DS08_Stack_LinkedList;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Stack size: ");
        int n = input.nextInt();

        Stack stack = new Stack(n);

        String q1 = "";
        while (q1 != "q") {

            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Show Top");
            System.out.println("4: Print");
            System.out.println("9: Quit");

            System.out.print("\nEnter the number of the action you want: ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Enter the number: ");
                    int x1 = input.nextInt();
                    stack.push(x1);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.showTop();
                    break;
                case 4:
                    stack.print();
                    break;
                case 9:
                    q1 = "q";
            }
        }
    }

}
