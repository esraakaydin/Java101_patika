package Conditional_Statements;

import java.util.Scanner;

public class Circles_area {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner veri = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        r = veri.nextInt();

        double area = (pi * r * r);
        double perimeter = (2 * pi * r);

        System.out.println("Area of the circle : " + area);
        System.out.println("Perimeter of the circle : " + perimeter);
    }
}