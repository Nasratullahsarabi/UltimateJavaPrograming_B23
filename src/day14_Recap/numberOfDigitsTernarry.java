package day14_Recap;

import java.util.Scanner;

public class numberOfDigitsTernarry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000");
        int num = scan.nextInt(); String result = "";

        result = (num>=0 && num<=699999)? (num<=9)?"1 digit":(num<=99)?"2 digits":
                (num<=999)?"3 digits":(num<=9999)?"4 digits":(num<=99999)?"5 digits"
                        :"6 digits" :"Invalied";
        System.out.println(result);

    }
}
