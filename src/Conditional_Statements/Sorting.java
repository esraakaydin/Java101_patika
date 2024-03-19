package Conditional_Statements;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number one for sorting : ");
        n1 = input.nextInt();

        System.out.println("Enter number two for sorting : ");
        n2 = input.nextInt();

        System.out.println("Enter number tree for sorting : ");
        n3 = input.nextInt();

        if (n1 == n2 || n2 == n3 || n1 == n3) {
            System.out.println("Please enter different numbers");
        }

        if (n1 < n2 && n1 < n3) {
            if(n2<n3){
                System.out.println( n1 +"\n"+ n2 +"\n"+ n3 );
            }
            else {
                System.out.println( n1 +"\n"+ n3 +"\n"+ n2 );
            } }
        else if  (n2<n1 && n2<n3){
            if( n1<n3){
                System.out.println( n2 +"\n"+ n1 +"\n"+ n3);
            }
            else{
                System.out.println( n2 +"\n"+ n3 +"\n"+ n1 );
            } }
        else{
            if(n1<n2 ){
                System.out.println( n3 +"\n"+ n1 +"\n"+ n2 );
            }
            else{
                System.out.println( n3 +"\n"+ n2 +"\n"+ n1 );
            }
        }


    }
}
