package day20_loopPractice;

import java.util.Scanner;

public class devisibleBy15And5And3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        String result1 = "Divisible by 15: ";
        String result2 = "Divisible by 5: ";
        String result3 = "Divisible by 3: ";
        String result4 = "Remaining:     ";

        if (num<0){
            System.out.println("your number should be positive");
            System.exit(0);
        }

        for (int i = 1; i <= num; i++) {
            if (i%15==0){
                result1+=i;
            }else if(i%5==0){
                result2+=i;
            }else if(i%3==0){
                result3+=i;
            }else {
                result4 +=i;
            }

        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
