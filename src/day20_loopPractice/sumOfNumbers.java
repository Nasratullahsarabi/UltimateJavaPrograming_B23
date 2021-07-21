package day20_loopPractice;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i ==0;) {
            System.out.println("number");
            int n = scan.nextInt();
            if (n<0){
                break;
            }else {
                result+= n;
            }

        }
        System.out.println(result);
        scan.close();


    }
}
