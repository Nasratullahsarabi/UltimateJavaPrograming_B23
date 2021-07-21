package statements;

import java.util.Scanner;

public class leasingOffice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!\nNumber of bedroom you are interested:");
        int numberOfBedroom = scan.nextInt();
        String result = ""; int price1Bed = 1100, price2Bed = 1850;
        int price3Bed = 2550;
        result = (numberOfBedroom == 1)?"One Bedroom selected\nStarting price: "+price1Bed:(numberOfBedroom == 2)?
                "Two Bedroom selected\nStarting price: "+price2Bed:(numberOfBedroom == 3)?
                "Three Bedroom selected\nStarting price: "+price3Bed:"No such Bedrooms available";

        System.out.println(result);



        scan.close();
    }
}
