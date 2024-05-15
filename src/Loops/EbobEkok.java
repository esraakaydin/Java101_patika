package Loops;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the second number :  ");
        int n2 = scan.nextInt();
        int i = 1, ebob = 1, ekok = 1;

            while (i <= n1 && i< n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            } ekok = n1 * n2 / ebob;
        System.out.println("Ebob : " + ebob + ", Ekok : " + ekok);
    }
}
