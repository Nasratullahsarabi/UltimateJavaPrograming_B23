package stringMethod;

import java.util.Scanner;

public class userAndPassword {
    public static void main(String[] args) {
        String userName = "Cybertek@gmail.com", password = "Cybertek123";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user");
        String userName1 = scan.nextLine();
        System.out.println("Enter password");
        String pass = scan.nextLine();

        if (userName1.equalsIgnoreCase(userName) && pass.equals(password)){
            System.out.println("successfully logged in");

        }else {
            System.out.println("wrong username or password");
        }


        scan.close();
    }
}
