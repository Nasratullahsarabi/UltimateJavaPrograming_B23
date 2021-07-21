package day20_loopPractice;

import java.util.Scanner;

public class catAndDog2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();
        System.out.println("Enter your first word");
        String firstWord = scan.next();
        System.out.println("Enter your second word");
        String secondWord = scan.next();
        int countFrstWrd = 0;
        int countscndWrd = 0;
        for (int i = 0; i <= sentence.length()-6; i++) {
            String eachFW = sentence.substring(i,i+6);
            String eacSW =  sentence.substring(i,i+6);
            if (eachFW.equalsIgnoreCase(firstWord)){
                countFrstWrd++;
            }
            if (eacSW.equalsIgnoreCase(secondWord)){
                countscndWrd++;
            }
        }
        System.out.println("countFrstWrd = " + countFrstWrd);;
        System.out.println("countscndWrd = " + countscndWrd);

        boolean isEqual = countFrstWrd == countscndWrd;

        System.out.println("isEqual = " + isEqual);




        scan.close();
    }
}
