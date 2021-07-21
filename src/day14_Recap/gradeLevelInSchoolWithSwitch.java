package day14_Recap;

import java.util.Scanner;

public class gradeLevelInSchoolWithSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade level");
        byte grade = scan.nextByte(); String result = "";

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "Elementary School";
                break;
            case 6:
            case 7:
            case 8:
                result = "Middle School";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                result = "High School";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                result = "colleg";
                break;
            case 17:
            case 18:
                result = "Gra School";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result);

        scan.close();
    }
}
