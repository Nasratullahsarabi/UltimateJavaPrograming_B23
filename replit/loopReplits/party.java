package loopReplits;

import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String guestList = "", respons = "";

        do {
            System.out.println("Please enter guest's name!");
            String guestName = scan.next();
            guestList+=guestName+",";
            System.out.println("Do you want to enter new guest name?");
            respons = scan.next();
        }while (respons.equals("yes"));

        System.out.println(guestList);


    }
}
