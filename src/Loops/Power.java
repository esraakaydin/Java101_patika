package Loops;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num , total = 1;
        int sum =0;

        System.out.print("Enter the number : ");
        num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(total);
            total *=4;

        }
         total=1;
        System.out.println("-----------------");
        for (int i = 0; i <= num; i++) {
            System.out.println(total);
            total *=5;

        }


    }
}
