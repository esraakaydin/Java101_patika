package Conditional_Statements;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double amount, kdvrate = 0.18, kdvrate2 = 0.08, kdvamount = 0, awkdv = 0;

        System.out.print("Please enter  the amount : ");
        amount = input.nextDouble();

        if (amount <= 1000 && amount >= 0) {
            kdvamount = amount * kdvrate;
            awkdv = amount + kdvamount;
        } else if (amount > 1000) {
            kdvamount = amount * kdvrate2;
            awkdv = amount + kdvamount;
        }

        System.out.println("Amount without KDV : " + amount);
        System.out.println("KDV amount : " + kdvamount);
        System.out.println("Amount with KDV : " + awkdv);
    }
}
