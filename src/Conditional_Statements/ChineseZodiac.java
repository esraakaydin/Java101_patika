package Conditional_Statements;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String zodiac = " ";
        int birthYear;
        double remain;
        System.out.println("Enter your birth year  : ");
        birthYear = input.nextInt();

        remain = birthYear % 12;

        if (remain == 0) {
            zodiac = "monkey";
        } else if (remain == 1) {
            zodiac = "chicken";
        } else if (remain == 2) {
            zodiac = "dog";
        } else if (remain == 3) {
            zodiac = "pig";
        } else if (remain == 4) {
            zodiac = "rat";
        } else if (remain == 5) {
            zodiac = "ox";
        } else if (remain == 6) {
            zodiac = "tiger";
        } else if (remain == 7) {
            zodiac = "rabbit";
        } else if (remain == 8) {
            zodiac = "dragon";
        } else if (remain == 9) {
            zodiac = "snake";
        } else if (remain == 10) {
            zodiac = "horse";
        } else if (remain == 11) {
            zodiac = "sheep";
        }

        System.out.println("Your chinese zodiac is " + zodiac);

    }
}
