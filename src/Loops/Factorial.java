package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num , count = 0, total = 1;

        System.out.println("Enter the number : ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            count += i;
            total *= i;
            System.out.print(i + ".");

        }
        System.out.print("=" + total);
    }
}
