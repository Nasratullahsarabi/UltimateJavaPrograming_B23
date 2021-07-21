package stringMethod;

public class creatEmail {
    public static void main(String[] args) {
        String fullName = "JamesBond Secret"; String domain = "@cyberTek.com";

        String firstName = fullName.substring(0,4);

        int lastNameSpaceOfIndex = fullName.indexOf(" ");
        String lastName1 = fullName.substring(lastNameSpaceOfIndex+1);
        String email = firstName+lastName1.substring(lastName1.length()-3)+domain;

        System.out.println(email.toLowerCase());



    }
}
