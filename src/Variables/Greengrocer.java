package Variables;

import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {

        double amount, pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.00;
        Scanner veri = new Scanner(System.in);

        System.out.print("How many pears did you buy ? ");
        int pearnum = veri.nextInt();
        double pearamount = pearnum * pear;

        System.out.print("How many apple did you buy ? ");
        int applenum = veri.nextInt();
        double appleamount = applenum * apple;

        System.out.print("How many tomato did you buy ? ");
        int tomatonum = veri.nextInt();
        double tomatoamount = tomatonum * tomato;

        System.out.print("How many banana did you buy ? ");
        int banananum = veri.nextInt();
        double bananaamount = banananum * banana;

        System.out.print("How many aubergine did you buy ? ");
        int auberginenum = veri.nextInt();
        double aubergineamount = auberginenum * aubergine;

        amount = aubergineamount + bananaamount + tomatoamount + appleamount * pearamount;

        System.out.println("Amount you need to pay " + amount);

    }
}