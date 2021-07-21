package string;

import java.util.Scanner;

public class findUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String fullName = scan.nextLine();
        String result = "";

        if (fullName.equals("Max Payne") || fullName.equals("Alan Wake")){

            result = "User found!";
        }else {
            result = "User Not Found";
        }
        System.out.println(result);

        scan.close();
    }
}
