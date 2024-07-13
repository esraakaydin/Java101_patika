package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum, num1=0, num2=1 ;
        System.out.print("Enter the number of element of  the array :");
        int nums = scan.nextInt();

        for (int i =0 ; i<nums ; i++){
            System.out.println( num1 + " + " + num2 + " = "  + (num1+ num2));
            sum = num1+num2;
            num1 = num2 ;
            num2 = sum ;
        }


    }
}
