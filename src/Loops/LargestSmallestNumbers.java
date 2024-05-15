package Loops;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers will you enter ? ");
        int n = scan.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the number " + i + " : ");
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a valid number:");
                scan.next();
            }
            int n1 = scan.nextInt();
            if (n1 > largest) {
                largest = n1;
            }
            if (n1 < smallest) {
                smallest = n1;
            }
        }
        System.out.println("Largest number : " + largest + " Smallest number : " + smallest);
    }
}
