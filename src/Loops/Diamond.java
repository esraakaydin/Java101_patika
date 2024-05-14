package Loops;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num -1 ; i >= 1; i--) {
            for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}