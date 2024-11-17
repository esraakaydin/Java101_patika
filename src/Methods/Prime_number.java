package Methods;
import java.util.Scanner;
import java.util.ArrayList;
public class Prime_number {
    public static boolean isPrime( int number , int divisor){
   // Stopping condition: If the divisor is equal to the number itself, it is prime
        if ( number == divisor ){
            return true;
        }
        // If the number is divisible by the divisor, it is not prime
       if( number % divisor == 0){
           return false;
       }
       return isPrime(number, divisor +1 );
       }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();

        if (number<=1 ){
            System.out.println(number + " İs not a prime number. ");
        }
        else if (isPrime(number,2)){
            System.out.println(number + " İs a prime number. ");
        }
        else {
            System.out.println(number + " İs not a prime number. ");
        }
        scan.close();

    }
    }