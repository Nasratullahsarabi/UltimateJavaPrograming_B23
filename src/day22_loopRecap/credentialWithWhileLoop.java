package day22_loopRecap;
import java.util.Scanner;
public class credentialWithWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String correctUser = "Nasratsarabi", correctPassword = "Afghan123"; int attept = 0;
        String user = "", password = "";

        while (!(user.equals(correctUser) && password.equals(correctPassword)) ){
            System.out.println("Enter your user & password");
            user = scan.next(); password = scan.next();
            attept++;

            if (attept == 3){
                System.out.println("you account is locked");
                System.exit(0);
            }
        }
        System.out.println("logged in");

        scan.close();
    }
}
