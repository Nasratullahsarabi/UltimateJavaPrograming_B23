package day12_scanner;

import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scan.nextInt();
        String result = "";
        if (number>=1&&number<=7){
            if (number==1){
                result="Monday";
            }else if (number==2){
                result="Tuesday";
            }else if (number==3){
                result="Wednesday";
            }else if (number==4){
                result="Thursday";
            }else if (number==5){
                result="Friday";
            }else if (number==6){
                result="Saturday";
            }else{
                result="Sunday";
            }

        }else{
            result= "Invalid Number";
        }
        System.out.println(result);


    }
}
