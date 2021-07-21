package day22_loopRecap;

import java.util.Scanner;

public class yesOrNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marr me?");
        String answer = scan.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no")) ){
            System.out.println("invalid, please re-enter");
            answer = scan.next();
        }

        if (answer.equals("yes")){
            System.out.println("congrats");
        }else {
            System.out.println("RIP");
        }

         scan.close();
    }
}
