package Conditional_Statements;

import java.util.Scanner;

public class Pass_class {
    public static void main(String[] args) {

        int math, phy, chm, turkish, history, music, divide = 6;
        double result = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your math grade :");
        math = inp.nextInt();
        if (math < 0 || math > 100) {
            System.out.println("Invalid point!");
            math = 0;
            divide -= 1;
        }

        System.out.print("Enter your physics grade : ");
        phy = inp.nextInt();
        if (phy < 0 || phy > 100) {
            System.out.println("Invalid point!");
            phy = 0;
            divide -= 1;
        }

        System.out.print("Enter your chemistry grade : ");
        chm = inp.nextInt();
        if (chm < 0 || chm > 100) {
            System.out.println("Invalid point! ");
            chm = 0;
            divide -= 1;
        }

        System.out.print("Enter your Turkish grade : ");
        turkish = inp.nextInt();
        if (turkish < 0 || turkish > 100) {
            System.out.println("Invalid point!");
            turkish = 0;
            divide -= 1;
        }

        System.out.print("Enter your history grade : ");
        history = inp.nextInt();
        if (history < 0 || history > 100) {
            System.out.println("Invalid point!");
            history = 0;
            divide -= 1;
        }
        System.out.print("Enter your music grade : ");
        music = inp.nextInt();
        if (music < 0 || music > 100) {
            System.out.println("Invalid point!");
            music = 0;
            divide -= 1;
        }
        result = (math + phy + chm + turkish + history + music) / divide;
        if (result >= 55) {
            System.out.println("Average : " + result);
            System.out.println("Congratulations you passed the class!");

        } else {
            System.out.println("Average : " + result);
            System.out.println("Unfortunately you didn't pass the class!");
        }

    }

}

