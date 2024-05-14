package Loops;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        double result = 0; // double türünde bir değişken kullanıyoruz
        for (double i = 1; i <= num; i++) {
            result += 1/i;
        }
        System.out.println(result);

    }
}
