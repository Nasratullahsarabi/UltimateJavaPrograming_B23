package day14_Recap;

import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000");
        int n = scan.nextInt();

        if (n>=1 && n<=100000){ //is to check if the number is valid
            if (n<=9){
                System.out.println("1 digit");
            }else if (n<=99){
                System.out.println("2 digitis");
            }else if (n <= 999){
                System.out.println("3 digitis");
            }else if (n<=9999){
                System.out.println("4 digitis");
            }else if (n<=99999){
                System.out.println("5 digitis");
            }else{
                System.out.println("6 digitis");
            }
        }else {
            System.out.println("invalid");
        }

        scan.close();
    }
}
