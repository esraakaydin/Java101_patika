package Conditional_Statements;

import java.util.Scanner;

public class Flight_ticket {
    public static void main(String[] args) {

        int age, type, km;
        double amount, discountAmount, ageDiscount, typeDiscount, newAmount = 0;
        System.out.println("Enter your age :");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        int count = 0;
        while (age <= 0) {
            if (count == 3) {
                break;
            }
            System.out.println("Enter your age :");
            age = input.nextInt();
            count++;

        }

        System.out.println("Enter the distance in kilometers: ");
        km = input.nextInt();
        while (km <= 0) {
            System.out.println("Enter the distance in kilometers: ");
            km = input.nextInt();
        }

        System.out.println("1 - Round Trip");
        System.out.println("2 - One Way");
        System.out.print("Enter your trip type : ");
        type = input.nextInt();
        while (type < 1 || type > 2) {
            System.out.println("1 - Round Trip");
            System.out.println("2 - One Way");
            System.out.print("Enter your trip type : ");
            type = input.nextInt();
        }
        if (age < 12) {
            amount = km * 0.10;
            ageDiscount = amount * 0.5;
            discountAmount = amount - ageDiscount;
            if (type == 1) {
                typeDiscount = discountAmount * 0.20;
                newAmount = discountAmount - typeDiscount;
                newAmount *= 2;
            } else {
                newAmount = discountAmount;
            }


        } else if (age >= 12 && age < 24) {
            amount = km * 0.10;
            ageDiscount = amount * 0.1;
            discountAmount = amount - ageDiscount;
            if (type == 1) {
                typeDiscount = discountAmount * 0.20;
                newAmount = discountAmount - typeDiscount;
                newAmount *= 2;
            } else {
                newAmount = discountAmount;
            }


        } else if (age <= 65 && age >= 24) {
            amount = km * 0.10;
            if (type == 1) {
                typeDiscount = amount * 0.20;
                newAmount = amount - typeDiscount;
                newAmount *= 2;
            } else {
                newAmount = amount;
            }


        } else if (age > 65) {
            amount = km * 0.10;
            ageDiscount = amount * 0.3;
            discountAmount = amount - ageDiscount;
            if (type == 1) {
                typeDiscount = discountAmount * 0.20;
                newAmount = discountAmount - typeDiscount;
                newAmount *= 2;
            } else {
                newAmount = discountAmount;
            }

        }
        System.out.println("Ticket price : " + newAmount);
    }
}
