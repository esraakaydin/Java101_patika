package Conditional_Statements;

import java.util.Scanner;

public class User_login {
    public static void main(String[] args) {

        String userId = "esra123", password, password1 = "esra123", newpassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your user name : ");
        userId = input.nextLine();

        System.out.print("Please enter your password :");
        password = input.nextLine();

        if (userId.equals("esra123") && password.equals(password1)) {
            System.out.println("Log in");
        }
        else {
            System.out.println("User name or password is wrong.Do you want to change your password? Yes or No ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("please enter your new password :");
                newpassword = input.nextLine();

                if ((newpassword.equals(password)) || (newpassword.equals(password1))) {
                    System.out.println("Could not create password. Please try another one.");
                }
                else {
                    System.out.println("Password has been changed. ");
                }
            } else {
                System.out.println("Try again later. ");

            }


        }

    }
}
