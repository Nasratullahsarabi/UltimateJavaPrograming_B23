package day22_loopRecap;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class yesOrNo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = scan.next();

        while (!(answer.equals("yes") || answer.equals("no")) ){
            System.out.println("invalid entry, please re-enter a valid response");
            answer = scan.next();
        }

        if (answer.equals("yes")){
            System.out.println("congrats");
        }else{
            System.out.println("Rip");
        }


    }
}
