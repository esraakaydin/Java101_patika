package Methods;
import java.util.Scanner;
public class Calculator {
    static int sum (int a ,int b){
        int result = a + b ;
        System.out.println("Sum = " + result);
        return result;
    }
    static int minus(int a,int b){
        int result = a - b ;
        System.out.println("Exraction = " + result);
        return result;
    }
    static int times(int a,int b){
        int result = a*b ;
        System.out.println("Multiplication = " + result);
        return result;
    }
    static int divided(int a,int b){
        if(b == 0){
            System.out.println("The second number must be non-zero.");
            return 0;
        }
        int result= a / b;
        System.out.println("Divided = " + result);
        return result;
    }
    static  int power(int a, int b) {
        int result = 1;
        for(int i = 1 ; i <= b ; i ++){
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b){
        return a % b ;
    }

    static void calculate(int a, int b){
        System.out.println("Primeter of a rectangle : " + ( 2*( a+ b )));
        System.out.println("Area of a rectangle : " + (a*b ));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Sum\n"
                + "2-Extraction\n"
                + "3-Multiplication\n"
                + "4-Divide\n"
                + "5-Exponential number \n"
                + "6-Mod\n"
                + "7-Rectangle perimeter and area calculation\n"
                + "8-Exit";

        System.out.println(menu);
        while(true){
            System.out.print("Select an operation : ");
            select = scan.nextInt();
            if(select == 0){
                break;
            }
            System.out.print("Enter the first number : ");
            int a = scan.nextInt();
            System.out.print("Enter the second number : ");
            int b = scan.nextInt();

            switch (select){
                case 1 :
                    sum(a,b);
                    break;
                case 2 :
                    minus(a,b);
                    break;
                case 3 :
                    times(a,b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Power : " + power( a ,b ));
                    break;
                case 6 :
                    System.out.println("Mod : " + mod(a,b));
                    break;
                case 7:
                    calculate(a,b);
                    break;
                default :
                    System.out.println("You entered an invalid transaction. ");
            }



        }





    }
}
