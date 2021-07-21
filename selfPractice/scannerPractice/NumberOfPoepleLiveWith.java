package scannerPractice;

import java.util.Scanner;

public class NumberOfPoepleLiveWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your zipcode");
        long zipcode = scan.nextLong();
        System.out.println("how many poeple do live in your household?");
        byte numberOfPoeple = scan.nextByte();
        System.out.println("are you married?");
        boolean isMarried = scan.nextBoolean();

        System.out.println("I see you are "+(isMarried==true?"married":"not married")+" and you live with "
        +numberOfPoeple+" people in your house in "+zipcode+" area.");


        scan.close();
    }
}
