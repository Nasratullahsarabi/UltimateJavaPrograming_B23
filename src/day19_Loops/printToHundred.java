package day19_Loops;

import java.util.Scanner;

public class printToHundred {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <=100 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("========================");
        Scanner scan = new Scanner(System.in);
        int sum1 = scan.nextInt();
        for (int i = 1; i <=sum1 ; i++) {

            sum1+=i;
            System.out.println(sum1);

        }

        scan.close();

    }
}
