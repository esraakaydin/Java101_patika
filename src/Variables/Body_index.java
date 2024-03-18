package Variables;

import java.util.Scanner;

public class Body_index {
    public static void main(String[] args) {
        double weight, height, index;
        Scanner veri = new Scanner(System.in);
        System.out.print("Enter your weight please : ");
        weight = veri.nextDouble();

        System.out.print("Enter your height in meters please :");
        height = veri.nextDouble();

        index = weight / (height * height);
        System.out.println("Your body mass index : " + index);


    }
}
