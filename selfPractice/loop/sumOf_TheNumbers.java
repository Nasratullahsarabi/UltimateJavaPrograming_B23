package loop;

import java.util.Scanner;

public class sumOf_TheNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter number");
            int sum = scan.nextInt();
            result += sum;

        }
        System.out.println(result);

        scan.close();
    }
}
