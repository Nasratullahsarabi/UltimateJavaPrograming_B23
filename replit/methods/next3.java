package methods;

import java.util.Scanner;

public class next3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int num = scan.nextInt();
        next3(num);

    }
    public static void next3(int num){
        System.out.println("next 3 are");
        String result = ++num+" "+ ++num+" "+ ++num;
        System.out.println(result);
    }
}
