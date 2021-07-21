package day22_loopRecap;

import javafx.scene.transform.Scale;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Sarabi hotel, do you want to reserve a room?");
        String answer = scan.nextLine().toLowerCase(); int price = 0;

        while (!(answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid entry, please select right answer");
            answer = scan.nextLine();
        }
        while (answer.equals("no")){
            System.out.println("Thank you for visiting the Sarabi hotel. Hope you visit our hotel some day");
            System.exit(0);
        }
        while (answer.equals("yes")){
            System.out.println("What bed type do you want?");
            String bedType = scan.nextLine();
            if (bedType.equalsIgnoreCase("king bed")){
                price+=120;
            }else if (bedType.equalsIgnoreCase("queen bed")){
                price+=100;
            }else if (bedType.equalsIgnoreCase("single bed")){
                price+=80;
            }else {
                System.out.println("Invalid bed type selecte.");
            }
            System.out.println("Do you want another room?");
            answer = scan.nextLine();
            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.out.println("Invalid entry, please select a valid response");
                answer = scan.nextLine();
            }
        }

        System.out.println("Total price: "+price);

        scan.close();

    }

}
/*
write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve and
            calculates the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            otherwise return the  total price
 */