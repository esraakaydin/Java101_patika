package Conditional_Statements;
import java.util.Scanner;
public class Weather_activities {
    public static void main(String[] args) {

        int heat;
        System.out.print("Enter temperature information : ");
        Scanner input = new Scanner(System.in);
        heat = input.nextInt();

        if (heat<5)
        {
            System.out.println("Skiing in this weather can be fun!");
        }
        else if ( heat >=5 && heat <= 15)
        {
            System.out.println("Going to the movies might be fun in this weather.");
        }
        else if (heat >15 && heat <=25)
        {
            System.out.println("Going on a picnic in this weather can be fun.");
        }
        else if(heat >25){
            System.out.println("Swimming in this weather can be fun.");
        }

    }
}
