package day4_Practice;

public class printReversWord {
    public static void main(String[] args) {
        String word = "Cybertek School";

        for (int i = word.length()-1; i >= 0; i--) {
            char ch = word.charAt(i);

            System.out.print(ch);

        }
    }
}

