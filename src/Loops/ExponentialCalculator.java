package Loops;

import java.util.Scanner;

public class ExponentialCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be exponentiated : ");
        int num= scan.nextInt();
        System.out.println("Enter the number to be the exponent : ");
        int exp = scan.nextInt();
        int i =1, total=1;
        while (i <=exp){
            total*=num;
            i++;
        }
        System.out.println(num+"^"+exp+"="+total);
    }
}
