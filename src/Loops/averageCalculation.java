package Loops;

import java.util.Scanner;

public class averageCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, num1, total = 0, count = 0;
        double average;
        System.out.println("Enter the number : ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total += i;
                count++;
            }
        }
        average = total / count;
        System.out.println("Average of numbers that are multiples of 3 and 4, from 0 to the entered number : " + average );
    }
}
