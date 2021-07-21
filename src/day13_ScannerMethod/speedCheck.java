package day13_ScannerMethod;

import java.util.Scanner;

public class speedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int speedLimit = 35;
        System.out.println("enter your speed");
        int currentspeed = scan.nextInt();
        int overSpeedLimit = currentspeed-speedLimit;
        if (overSpeedLimit>0){
            System.out.println("you are driving"+overSpeedLimit+" over spped limit. dlow down");
        }


    }
}
