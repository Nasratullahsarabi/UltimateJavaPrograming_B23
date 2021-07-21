package string;

import java.util.Scanner;

public class printThreeMiddle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() >= 5 && word.length()%2!=0){
            int middleNumber1 = word.length()/2-1;
            int middleNumber2 = word.length()/2;
            int middleNumber3 = word.length()/2+1;
            System.out.println(word.charAt(middleNumber1)+""+word.charAt(middleNumber2
            )+""+word.charAt(middleNumber3));

        }else {
            System.out.println("invalid");
        }

        scan.close();
    }
}
