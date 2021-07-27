package pr1;

import java.util.Scanner;

public class atiq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to cybertek apartment\nNumber of bedroom you are interes: ");
        int n = scan.nextInt();
        int bedroom1 = 1100,
                bedroom2 = 1850,
                bedroom3 = 2550;

        if(n == 1){
            System.out.println("one bedroom selected\nStarting price"+ bedroom1);
        }else if (n == 2){
            System.out.println("two bedroom selected\nStarting price"+ bedroom2);
        }else if (n==3){
            System.out.println("three bedroom selected\nStarting price"+ bedroom3);
        }else {
            System.out.println("Invalid number");
        }

    }
}



