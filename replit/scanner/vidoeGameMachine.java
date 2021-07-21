package scanner;

import java.util.Scanner;

public class vidoeGameMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int coupon = scan.nextInt();

        if (coupon>=3){
            System.out.println("Number of Candies "+coupon/10);
            System.out.println("Number of Gumballs "+(coupon%10)/3);
        }else {
            System.out.println("Not enough coupons");
        }

    }
}
