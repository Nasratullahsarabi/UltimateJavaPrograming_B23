package loop;

import java.util.Scanner;

public class findPalindrome2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palindrome = scan.next(), result  = "";
        for (int i = palindrome.length()-1; i >= 0;i--){
            result += palindrome.charAt(i);
        }
        boolean isPalindrom = palindrome.equalsIgnoreCase(result);
        System.out.println(isPalindrom);

        scan.close();
    }
}
