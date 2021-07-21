package loopReplits;
import java.util.Scanner;
public class partyTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String guestList = ""; String answer = "";

        do {
            System.out.println("enter guest name:");
            String guestName = scan.next();
            guestList+=guestName+", ";
            System.out.println("do you want to enter new guest name");
            answer = scan.next();
            while (!(answer.equals("yes")||answer.equals("no")) ){
                System.out.println("invalid entery, pleaes enter right answer");
                answer = scan.next();
            }
        }while (answer.equals("yes"));





        System.out.println("Gues list: "+guestList);

        scan.close();
    }
}
