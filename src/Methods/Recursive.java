package Methods;
import java.util.Scanner;
public class Recursive {
    public static int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        else if( exponent < 0){
            return 1 / power(base, - exponent );
        }
        return base* power(base, exponent -1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(("Enter the base : "));
        int base = scan.nextInt();
        System.out.print("Enter the exponent : ");
        int exponent = scan.nextInt();

        int result = power(base, exponent);
        System.out.print(base + " ^ " + exponent + " = " + result );
    }
}

