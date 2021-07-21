package day20_loopPractice;

import java.util.Locale;
import java.util.Scanner;

public class frequencyOfWord3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();
        System.out.println("Enter your word");
        String city = scan.next();
        for (int i = 0; i <= sentence.length()-city.length(); i++) {
            String cityCount = sentence.substring(i,i+city.length());
            if (cityCount.equalsIgnoreCase(city)){
                count++;
            }

        }
        System.out.println(count);

        scan.close();
    }
}
