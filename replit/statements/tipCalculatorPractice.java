package statements;

import java.util.Scanner;

public class tipCalculatorPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split?");
        String yesNo = scan.next();
        while (!(yesNo.equals("yes") || yesNo.equals("no")) ){
            System.out.println("Invalid Entry please select yes or no");
            yesNo = scan.next();
        }
        System.out.println("Enter number of people");
        byte numberOfPeople = scan.nextByte();
        System.out.println("Enter check amount");
         double checkAmount = scan.nextDouble();
        System.out.println("Enter service quality");
        String serviceQuality = scan.next();
        String peopleCount = "";
        for (int i = 0; i < numberOfPeople; i++) {
            peopleCount+="&";
        }
        double result = 0;

        if (serviceQuality.equals("Excellent")){
            result = checkAmount+(checkAmount*0.25);
        }else if (serviceQuality.equals("Great")){
            result = (checkAmount+(checkAmount*0.2));
        }else if (serviceQuality.equals("Good")){
            result = (checkAmount+(checkAmount*0.15));
        }else if (serviceQuality.equals("Fair")){
            result = (checkAmount+(checkAmount*0.1));
        }else if (serviceQuality.equals("Poor")){
            result = (checkAmount+(checkAmount*0.5));
        }else {
            while ( !(serviceQuality.equals("Excellent") || serviceQuality.equals("Great") ||
                    serviceQuality.equals("Good") || serviceQuality.equals("Fair") ||
                    serviceQuality.equals("Poor"))){
                System.out.println("Invalid entry, please select a valid entry");
                serviceQuality = scan.next();
                if (serviceQuality.equals("Excellent")){
                    result = checkAmount+(checkAmount*0.25);
                }else if (serviceQuality.equals("Great")){
                    result = (checkAmount+(checkAmount*0.2));
                }else if (serviceQuality.equals("Good")){
                    result = (checkAmount+(checkAmount*0.15));
                }else if (serviceQuality.equals("Fair")){
                    result = (checkAmount+(checkAmount*0.1));
                }else if (serviceQuality.equals("Poor")){
                    result = (checkAmount+(checkAmount*0.5));
                }

            }
        }
        if (yesNo.equals("no")){
            System.out.println("Total to pay: "+result);
            System.exit(0);
        }
        System.out.println("Number of people entered: "+peopleCount);
        System.out.println("Total to pay:"+result+"\nTotal tip:"+(result-checkAmount)+"\nTotal per person "+
                result/4+" \nTip per person "+(result-checkAmount)/4);



        scan.close();
    }
}
