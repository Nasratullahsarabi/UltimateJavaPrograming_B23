package day21_doWhileLoop;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while (true){
            int num = scan.nextInt();
            if (num<0){
                break;
            }else{
                sum+=num;
            }

        }
        System.out.println(sum);

        scan.close();

    }
}
