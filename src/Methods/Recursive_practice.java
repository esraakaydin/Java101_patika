package Methods;
import java.util.Scanner;
public class Recursive_practice {
    public static void recursive(int n){
            if(n <=0){
                System.out.println(n);
                return;
            }
        System.out.println(n);
           recursive(n-5);
        System.out.println(n + 5);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        recursive(n);
        scan.close();
    }
}
