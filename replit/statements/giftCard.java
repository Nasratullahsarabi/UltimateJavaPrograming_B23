package statements;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next(); int price = 0;

        if(input.equals("Blanket")|| input.equals("Charger")|| input.equals("Hat")
                || input.equals("Headphon")|| input.equals("Laptop")|| input.equals("Pants")
                || input.equals("Pillow")|| input.equals("Smartphone")|| input.equals("Socks")
                ||input.equals("cable")){

                if (input.equals("Blanket")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-60));
                }else if(input.equals("Charger")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-15));
                }else if(input.equals("Hat")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-25));
                }else if(input.equals("Headphones")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-30));
                }else if(input.equals("Laptop")){
                    System.out.println("Sorry, not funds on your gift card!: ");
                }else if(input.equals("Pants")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-50));
                }else if(input.equals("Pillow")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-40));
                }else if(input.equals("Smartphone")){
                    System.out.println("Sorry, not funds on your gift card!: ");
                }else if(input.equals("Socks")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-5));
                }else if(input.equals("cable")){
                    System.out.println("Thank you for your purchase!\nYour current balance is: "+(100-10));
                }

        }else {
            System.out.println("Invalid item!");
        }

        scan.close();
    }
}
