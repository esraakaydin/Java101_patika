package Conditional_Statements;

import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year, remain, remain2, remain3;

        System.out.println("Enter the year you want to find out if it is a leap year : ");
        year = input.nextInt();


        if (year % 100 == 0) {
            if (year % 4 == 0 && year % 400 == 0) {
                System.out.println("This year is a leap year. ");
            } else {
                System.out.println("This year isnt a leap year. ");
            }

        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("This year is a leap year. ");
        } else if (year % 4!= 0) {
            System.out.println("This year isnt a leap year. ");
        }

    }
}
