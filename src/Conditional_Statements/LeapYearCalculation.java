package Conditional_Statements;

import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year, remain, remain2, remain3;

        System.out.println("Enter the year you want to find out if it is a leap year : ");
        year = input.nextInt();

        remain = year % 4;
        remain2 = year % 100;
        remain3 = year % 400;

        if (remain2 == 0) {
            if (remain == 0 && remain3 == 0) {
                System.out.println("This year is a leap year. ");
            } else {
                System.out.println("This year isnt a leap year. ");
            }

        } else if (remain == 0 && remain2 != 0) {
            System.out.println("This year is a leap year. ");
        } else if (remain != 0) {
            System.out.println("This year isnt a leap year. ");
        }

    }
}
