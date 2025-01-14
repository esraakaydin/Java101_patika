package Methods;

import java.util.Scanner;


public class Polindrom {

    static boolean isPolindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPolindrom(313));
    }
}
