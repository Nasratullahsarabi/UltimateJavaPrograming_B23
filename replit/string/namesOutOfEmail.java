package string;

import java.util.Scanner;

public class namesOutOfEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int firstNameIndex_ = email.indexOf("_");
        int lastNameOfAt = email.indexOf("@");
        int domainIndex = email.indexOf(".");

       String firstName = email.substring(0,firstNameIndex_);
       String lastName = email.substring(firstNameIndex_+1,lastNameOfAt);
       String domain = email.substring(lastNameOfAt+1,domainIndex);

       //String newFirstName = (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1);
      // String  newLastName = (""+lastName.charAt(0)).toUpperCase()+lastName.substring(1);

        String upperCaseFN = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String upperCaseLN = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println(upperCaseFN);
        System.out.println(upperCaseLN);
        System.out.println(domain);






    }
}
