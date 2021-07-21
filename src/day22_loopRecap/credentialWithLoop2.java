package day22_loopRecap;
import java.util.Scanner;
public class credentialWithLoop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cU = "Nasratullah", cP = "Sarabi";
        String user = "", password = ""; int attempt = 0;

        while ( !(user.equals(cU) && password.equals(cP))){
            System.out.println("Enter your user and password!");
            user = scan.next(); password = scan.next();
            attempt++;
            if (attempt==3){
                System.err.println("Account locked");
                System.exit(0);
            }

        }
        System.out.println("logged in successfully");
    }
}
