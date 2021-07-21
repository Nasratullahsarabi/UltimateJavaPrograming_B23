package day21_doWhileLoop;

import java.util.Scanner;

public class numbers2 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        int n = new Scanner(System.in).nextInt();

        if (n <= 0){
            System.err.println("invalid");
            System.exit(0);
        }
        String result1 = "Dibisible by 15: ";
        String result2 = "Dibisible by 5: ";
        String result3 = "Dibisible by 3: ";

        for (int i = 1; i <= n; i++) {

            if ( i%15 == 0){
                result1+= i+" ";
            }else if (i%5==0){
                result2+=i+" ";
            }else if (i%3==0){
                result3+=i+" ";
            }

        }
        System.out.print(result1);
        System.out.print(result2);
        System.out.print(result3);

    }
}
