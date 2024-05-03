package Conditional_Statements;

import java.util.Scanner;

public class Finding_ahoroscope {
    public static void main(String[] args) {

        int day , month;
        String sign= " ";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your birth mounth : ");
        month= input.nextInt();

        System.out.println("Please enter yout birth day : ");
        day = input.nextInt();

        switch (month ){
            case 1:
                if(day>=1 && day<=31){
                    if(day<22){
                        sign= "capricorn";
                    }
                    else{
                       sign= "aquarius";
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 2:
                if(day>=1 && day<=28){
                    if(day<20){
                       sign="aquarius";
                    }
                    else{
                        sign="pisces.";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 3:
                if(day>=1 && day<=31){
                    if(day<21){
                        sign="pisces";
                    }
                    else{
                        sign="aries.";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 4:
                if(day>=1 && day<=30){
                    if(day<21){
                        sign="aries";
                    }
                    else{
                        sign="taurus.";
                    }
                }
                else {
                    isError=true;
                }
                break;
            case 5:
                if(day>=1 && day<=30){
                    if(day<22){
                        sign="taurus";
                    }
                    else{
                        sign="gemini";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 6:
                if(day>=1 && day<=30){
                    if(day<23){
                        sign="gemini";
                    }
                    else{
                        sign="cancer.";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 7:
                if(day>=1 && day<=31){
                    if(day<23){
                        sign="cancer";
                    }
                    else{
                        sign="leo.";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 8:
                if(day>=1 && day<=31){
                    if(day<20){
                        sign="leo";
                    }
                    else{
                        sign="virgo";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 9:
                if(day>=1 && day<=30){
                    if(day<23){
                        sign="virgo";
                    }
                    else{
                        sign="libra";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 10:
                if(day>=1 && day<=31){
                    if(day<23){
                        sign="libra";
                    }
                    else{
                        sign="scorpio";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 11:
                if(day>=1 && day<=31){
                    if(day<22){
                        sign="scorpio";
                    }
                    else{
                        sign="sagittarius";
                    }
                }
                else{
                    isError=true;
                }
                break;
            case 12:
                if(day>=1 && day<=31){
                    if(day<22){
                        sign="sagittariıus";
                    }
                    else{
                        sign="capricorn";
                    }
                }
                else{
                    isError=true;
                }
                break;


        }
        if(isError){
            System.out.println("You logged in incorrectly, try again.");
        }
        else{
            System.out.println("Your zodiac sign is: "+ sign );
        }

    }
}