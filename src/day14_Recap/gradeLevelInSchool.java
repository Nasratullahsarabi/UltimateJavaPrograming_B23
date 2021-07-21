package day14_Recap;

import java.util.Scanner;

public class gradeLevelInSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade level");
        byte grade = scan.nextByte(); String result = "";

        if (grade>=1 && grade <= 18){
            if (grade>=1 && grade<=5){
                result = "Elementary school";
            }else if (grade>=6 && grade<=8){
                result = "Middle school";
            }else if (grade>=9 && grade<=12){
                result = "High school";
            }else if (grade>=13 && grade<=16){
                result = "College";
            }else {
                result = "Grad school";
            }
        }else{
            result = "Invalid grade level given";
        }
        System.out.println(result);


/*
        result = (grade>=1 && grade <=18)?(grade<=5)?"elementary school":(grade<=8)?"middle school"
                :(grade<12)?"high schoo":(grade<=16)?"college":"grad school"
                :"Invalid grade level";
        System.out.println(result);

 */
        scan.close();
    }
}
