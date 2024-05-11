package Loops;

import java.util.Scanner;

public class training {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number ;
        /* for ( boolean run = true ; run ; ){
            System.out.println("Enter the number  : ");
            number = input.nextInt();
            if(number<0){
                run = false ;
            }
        } */

        do {
            System.out.println("Enter the number : ");
            number = input.nextInt();
        }
        while (number >0);
    }
}
