package day12_scanner;

import java.util.Scanner;

public class daysInWeekSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = scan.nextInt(); String result = "";
        switch (number){
            case 1:
                result = "Mon";
                break;
            case 2:
                result = "Tue";
                break;
            case 3:
                result = "Wed";
                break;
            case 4:
                result = "Thu";
                break;
            case 5:
                result = "Fri";
                break;
            case 6:
                result = "Sat";
                break;
            case 7:
                result = "Sun";
                break;
        }
        System.out.println(result);
    }
}
