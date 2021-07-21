package stringMethod;

public class swapTheEmail {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com", domain = "@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String newEmail = lastName+"_"+firstName+domain;

        System.out.println("newEmail = " + newEmail);

    }
}
