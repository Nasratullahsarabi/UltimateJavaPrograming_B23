package loop;

import java.util.Scanner;

public class findPalinderomeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next(); String result = "";

        for (int i = word.length()-1; i >= 0; i--) {
            result += word.charAt(i);

        }
        boolean isPalinderome = word.equalsIgnoreCase(result);
        System.out.println(isPalinderome);

        scan.close();

    }
}
