package scanner;

import java.util.Scanner;

public class firstScannerReplIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your number");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int sum = n1+n2+n3;
        System.out.println("sum of your number is: "+sum);
    }
}
