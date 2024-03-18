
package Conditional_Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Taximeter_calculation {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, tutar;

        Scanner veri = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers : ");
        km = veri.nextInt();
        tutar = 10 + (km * perKm);

        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Total amount : " + tutar);


    }
}