package day14_Recap;

import java.util.Scanner;

public class scannerPractic2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your zipcode");
        long zipCode = scan.nextLong();

        System.out.println("how many poeple do you live with");
        byte poeple = scan.nextByte();

        System.out.println("Are you married");
        boolean isMarried = scan.nextBoolean();

        System.out.println("I see you are "+((isMarried)?"married":"not married")+
                " and live with "+poeple+" poeple in your house which is in the "+zipCode+"zipcode");

        scan.close();
    }
}
