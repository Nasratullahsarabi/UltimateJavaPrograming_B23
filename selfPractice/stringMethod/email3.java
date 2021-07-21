package stringMethod;

public class email3 {
    public static void main(String[] args) {

        String email = "craig_federghi@apple.com";

        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

        String upperFirstName = (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1);
        String upperLastName = (""+lastName.charAt(0)).toUpperCase()+lastName.substring(1);
        String upperDomain = (""+domain.charAt(0)).toUpperCase()+domain.substring(1);

        System.out.println("upperFirstName = " + upperFirstName);
        System.out.println("upperLastName = " + upperLastName);
        System.out.println("upperDomain = " + upperDomain);


    }
}
