package loop;

import java.util.Scanner;

public class maxAndMinNmbrs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxN = -2147483648;
        for (int i = 0; i < 4;i++){
            System.out.println("enter number");
            int n = scan.nextInt();
            if (n>maxN){
                maxN = n;
            }
        }
        System.out.println(maxN);
        System.out.println();
        System.out.println("====================================");
        int min = 2147483647;
        for (int i = 0; i < 4; i++) {
            System.out.println("enter a number");
            int n1 = scan.nextInt();
            if (n1<min){
                min = n1;
            }

        }
        System.out.println(min);


        scan.close();

    }
}
