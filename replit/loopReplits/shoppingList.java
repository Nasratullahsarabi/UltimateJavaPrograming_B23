package loopReplits;

import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "", item = ""; double totalPrice = 0; String result = ""; int count = 0;


        do {
            System.out.println("Enter Item and its price: ");
            item = scan.next(); count++;
            double price = scan.nextDouble();
            result+= "Item"+count+": "+item+" price: "+price+", ";
            totalPrice+=price;
            System.out.println("Add one more item? ");
            answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
                System.out.println("Invalid answer, please enter yes or no");
                answer = scan.next();
            }


        }while (answer.equalsIgnoreCase("yes"));

        System.out.println(result.substring(0,result.length()-2));
        System.out.println("Total price: "+totalPrice);


    }
}
