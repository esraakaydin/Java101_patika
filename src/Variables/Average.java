package Variables;

import java.util.Scanner;


public class Average {

    public static void main(String[] args) {
        int math, phy, chm, turkish, history, music;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your math grade :");
        math = inp.nextInt();

        System.out.print("Enter your physics grade : ");
        phy = inp.nextInt();

        System.out.print("Enter your chemistry grade : ");
        chm = inp.nextInt();

        System.out.print("Enter your Turkish grade : ");
        turkish = inp.nextInt();

        System.out.print("Enter your history grade : ");
        history = inp.nextInt();

        System.out.print("Enter your music grade : ");
        music = inp.nextInt();

        int total = (math + phy + chm + turkish + history + music);
        double result = total / 6.0;

        System.out.println("Your grade point average : " + result);
    }
}
