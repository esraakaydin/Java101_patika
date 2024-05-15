package Loops;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of digits : ");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
