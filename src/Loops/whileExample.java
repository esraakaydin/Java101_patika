package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class whileExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int password;
        boolean isPasswordSuccces = false;


        while (!isPasswordSuccces ) {
            System.out.println("Enter the password : ");
            password = input.nextInt();
           if (password == 123)
            {
                System.out.println("True!");
                isPasswordSuccces =true;
            }
            else {
                System.out.println("Wrong!");
            }

        }
    }
}
