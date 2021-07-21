package day12_scanner;

import java.util.Scanner;

public class nameOfMonths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int month = scan.nextInt(); String result = "";
        if (month>=1 && month<=12){
            if (month==1){
                result = "Jan";
            }else if (month==2){
                result = "Feb";
            }else if (month==3){
                result = "Mar";
            }else if (month==4){
                result = "Apr";
            }else if (month==5){
                result = "May";
            }else if (month==6){
                result = "Jun";
            }else if (month==7){
                result = "Jul";
            }else if (month==8){
                result = "Aug";
            }else if (month==9){
                result = "Sep";
            }else if (month==10){
                result = "Oct";
            }else if (month==11){
                result = "Nov";
            }else {
                result = "Dec";
            }

        }else {
            result = "Invalid";
        }
        System.out.println("result = " + result);
    }
}
