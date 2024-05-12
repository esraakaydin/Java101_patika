package Loops;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int num;

        do {
            System.out.print("Enter the number : ");
            num = input.nextInt();

            if (num % 2 == 0) {
                total += num;
                System.out.println(total);

            }
        }
        while (num % 2 != 1);
        System.out.println(total);
    }
}
