package methods;

import java.util.Scanner;

public class plusTwoNumbers {
    public static void main(String[] args) {

        sum();
    }
    public static void sum (){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter firs number");
        int num = scan.nextInt();
        System.out.println("enter second number");
        int num2 = scan.nextInt();
        int result = num+num2;
        System.out.println(result);
    }
}
