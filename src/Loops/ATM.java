package Loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int balance = 1500, select;
        boolean loggedIn = false;
        while (right > 0 && !loggedIn) {
            System.out.println("Enter your username : ");
            String username = scan.nextLine();
            System.out.println("Enter your password : ");
            String password = scan.nextLine();
            if (username.equals("patika") && password.equals("patika123")) {
                System.out.println("Login successful! ");
                loggedIn = true;
                do {
                    System.out.println("Enter 1_Deposit \n " +
                            "2_Money Withdrawal \n " +
                            "3_Balance Inquiry \n " +
                            "4_Exit ");
                    select = scan.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Enter the amount : ");
                            int amount = scan.nextInt();
                            balance += amount;
                            System.out.println(balance);
                            break;
                        case 2:
                            System.out.println("Enter the amount : ");
                            amount = scan.nextInt();
                            if (amount > balance) {
                                System.out.println("Insufficient funds");
                            } else {
                                balance -= amount;
                                System.out.println(balance);
                            }
                            break;
                        case 3:
                            System.out.println(balance);
                            break;
                        case 4:
                            System.out.println("Exit succesful ! ");
                            break;
                        default:
                            System.out.println("Invalid option ! ");
                            break;
                    }
                } while (select != 4);
            } else {
                right--;
                System.out.println("You have logged in incorrectly. Please try again. ");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Contact your bank.");
                } else {
                    System.out.println("Your remaining rights : " + right);
                }
            }
        }
    }
}
