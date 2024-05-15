package Loops;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        Scanner scan = new Scanner(System.in);
        int a = 1;
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print( " " + i);
            }
        }
    }
}
