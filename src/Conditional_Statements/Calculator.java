

package Conditional_Statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int n1, n2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        n1 = input.nextInt();

        System.out.println("Please enter second number : ");
        n2 = input.nextInt();

        System.out.println("Press 1 to add, 2 to subtract, 3 to multiply, 4 to divide.");
        int press = input.nextInt();

        switch (press) {
            case 1:

                System.out.print("Sum of " + n1 + " and " + n2 + " : " + (n1 + n2));

                break;

            case 2:
                System.out.print("Difference between " + n1 + " and " + n2 + " 5000" +
                        "3: " + (n1 - n2));
                break;

            case 3:
                System.out.print("Multiplication of " + n1 + " and " + n2 + " : " + (n1 * n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.print("Dividing " + n1 + " by " + n2 + " : " + (n1 / n2));
                } else {
                    System.out.println("A number cannot be divided by zero");
                }
                break;

            default:
                System.out.println("Invalid option! Please enter 1, 2, 3 or 4.");


        }
    }

}
