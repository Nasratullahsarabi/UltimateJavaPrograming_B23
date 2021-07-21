package day20_loopPractice;

import java.util.Scanner;

public class frequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();
        System.out.println("Enter your word");
        String word = scan.next();
        for (int i = 0; i <= sentence.length()-word.length() ; i++) {
            String eachWord = sentence.substring(i,i+word.length());
            if (eachWord.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println("result: "+count);

        scan.close();

        }

    }

