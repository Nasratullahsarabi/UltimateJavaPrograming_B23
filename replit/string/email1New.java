package string;

import java.util.Scanner;

public class email1New {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");


        if (email.contains("_")){
            String firstName = email.substring(0,indexOf_);
            String lastName  = email.substring(indexOf_+1,indexOfAt);
            System.out.println(lastName+"_"+firstName+email.substring(indexOfAt));
        }else {
            System.out.println(email);
        }

        scan.close();
    }
}
