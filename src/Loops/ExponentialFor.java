package Loops;

import java.util.Scanner;

public class ExponentialFor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be exponentiated : ");
        int num= scan.nextInt();
        System.out.println("Enter the number to be the exponent : ");
        int exp = scan.nextInt();
        int total = 1;
        for( int i =1 ; i<=exp ; i++){
            total*=num;
        }
        System.out.println(num+"^"+exp+"="+total);
    }
}
