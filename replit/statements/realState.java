package statements;

import java.util.Scanner;

public class realState {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the real state calculator!\nEnter your property type:");
        String propertyType = scan.nextLine(); int propertyPrice = 0;

        if (propertyType.equalsIgnoreCase("Condo")){
            propertyPrice += 50000;
            System.out.println("How many bedrooms do you have");
            int numberOfBedroom = scan.nextInt();
            propertyPrice+= 30000*numberOfBedroom;
        }else if(propertyType.equalsIgnoreCase("Townhouse")){
            propertyPrice += 75000;
            System.out.println("How many bedrooms do you have");
            int numberOfBedroom = scan.nextInt();
            propertyPrice+= 30000*numberOfBedroom;
        }else if(propertyType.equalsIgnoreCase("Single Family Home")){
            propertyPrice += 95000;
            System.out.println("How many bedrooms do you have");
            int numberOfBedroom = scan.nextInt();
            propertyPrice+= 30000*numberOfBedroom;
        }else {
            System.out.println("Sorry not available that type of house");
        }
        System.out.println("Do you have a backyard");
        boolean backyard = scan.nextBoolean();

        if (backyard && propertyType.equalsIgnoreCase("Condo")){
            System.out.println("Backyard is not available for Condo!");
        }else if (backyard){
            propertyPrice += 5000;
        }else {
            System.out.println(propertyPrice);
        }
        System.out.println("Do you have garage?");
        boolean garage = scan.nextBoolean();
        if (garage){
            scan.nextLine();
            System.out.println("How many spots?");
            int garageSpot = scan.nextInt();
            if (garageSpot >10){
                System.out.println("Pardon, it's not a public parking");
            }else {
                propertyPrice += 20000*garageSpot;
            }
        }else {
            System.out.println(propertyPrice);
        }
        System.out.println("How close is metro station?");
        float  metroStation = scan.nextFloat();
        if (metroStation <= 1){
            propertyPrice+=10000;
        }else{
            propertyPrice+= 5000;
        }
        System.out.println("How close is the highway?");
        float highWay = scan.nextFloat();
        if (highWay <= 1){
            propertyPrice+=15000;
        }else if (highWay >=1 && highWay <= 5){
            propertyPrice+=8000;
        }else {
            propertyPrice+=4000;
        }
        System.out.println("What is the rating of nearest school?");
        int schoolRating = scan.nextInt();
        if (schoolRating >=8 && schoolRating <=10){
            propertyPrice+=45000;
        }else if (schoolRating >=4){
            propertyPrice+=20000;
        }else {
            propertyPrice+=5000;
        }
        System.out.println("Does any your family members smoking?");
        boolean smoking = scan.nextBoolean();
        if (smoking){
            propertyPrice-=5000;
        }else {
        }

        System.out.println("Market report has been generated.\n" +
                        "Your estimate market price is: "+propertyPrice);





        scan.close();
    }
}
