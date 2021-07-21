package statements;

import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split?");
        String yesNo = scan.next();
        System.out.println("Enter number of people");
        byte numberOfPeople = scan.nextByte();
        System.out.println("Enter check amount");
         double checkAmount = scan.nextDouble();
        System.out.println("Enter service quality");
        String serviceQuality = scan.next();
        String peopleCount = "";

        for (int i = 0; i < numberOfPeople; i++) {
            peopleCount +="&";
        }
        System.out.println("Number of people entered: "+peopleCount);

        double result = 0;

        if (serviceQuality.equals("Excellent")){
            result = checkAmount+(checkAmount*0.25);
        }else if (serviceQuality.equals("Great")){
            result = (checkAmount+(checkAmount*0.2));
        }else if (serviceQuality.equals("Good")){
            result = (checkAmount+(checkAmount*0.15));
        }else if (serviceQuality.equals("Fair")){
            result = (checkAmount+(checkAmount*0.1));
        }else {
            result = (checkAmount+(checkAmount*0.05));
        }

        System.out.println("Total to pay:"+result+"\nTotal tip:"+(result-checkAmount)+"\nTotal per person "+
                result/numberOfPeople+" \nTip per person "+(result-checkAmount)/numberOfPeople);



        scan.close();



    }
}
