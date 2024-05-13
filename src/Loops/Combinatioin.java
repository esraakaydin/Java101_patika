package Loops;

import java.util.Scanner;

public class Combinatioin {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of elements of the set : ");
            int n = scan.nextInt();
            System.out.println("Enter how many combinations you want : ");
            int r = scan.nextInt();
            int total=1 , total1=1 , total2=1;

            System.out.println("C(n,r) = n! / (r! * (n-r)!)");

            for (int i = 1; i <= n; i++) {
                total *= i;

            }
             System.out.println(n + "! =" +total);
            for (int j= 1; j <= r; j++) {
            total1 *= j;
        }
          System.out.println(r + "! =" +total1);
        for (int k= 1; k <= n-r; k++) {
          total2 *= k;
        }
        System.out.println(n-r + "! =" +total2);

        System.out.println("C("+ n +","+r + ") = "+ n + "! / (" + r + " ! * ("+ n+ "-" + r+ ")!)");
        System.out.println( total / (total1 * total2));
    }}
