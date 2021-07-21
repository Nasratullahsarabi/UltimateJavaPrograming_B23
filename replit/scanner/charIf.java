package scanner;

import java.util.Scanner;

public class charIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your command");
        char yes = scan.next().charAt(0);
        if (yes=='y'){
            System.out.println("Your request is being processed");
        }else if (yes=='n'){
            System.out.println("thank you any way");
        }else if (yes=='h'){
            System.out.println("sorry no help is available at the momen");
        }else {
            System.out.println("invalid attempt");
        }
    }
}
