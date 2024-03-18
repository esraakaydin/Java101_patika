package Conditional_Statements;

import java.util.Scanner;

public class Triangles_area {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, cevre, alan, alankare, u;

        Scanner veri = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            if (i == 1) {
                System.out.print("Please enter the lenght of the " + i + ". side of the triangle :");
                a = veri.nextDouble();
            } else if (i == 2) {
                System.out.print("Please enter the lenght of the " + i + ". side of the triangle :");
                b = veri.nextDouble();
            } else if (i == 3) {
                System.out.print("Please enter the lenght of the " + i + ". side of the triangle :");
                c = veri.nextDouble();
            }
        }
        cevre = a + b + c;
        u = cevre / 2.0;

        System.out.println("Perimeter of triangle : " + cevre);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Area of triangle : " + alan);
    }
}