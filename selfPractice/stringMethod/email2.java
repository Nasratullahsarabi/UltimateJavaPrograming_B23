package stringMethod;

public class email2 {
    public static void main(String[] args) {
        String email = "carig_federaghi@apple.com";
        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        String newFirstName = (""+firstName.charAt(0)).toUpperCase() + firstName.substring(1);
        String newLastName = (""+lastName.charAt(0)).toUpperCase()+newFirstName.substring(1);
        String newDomain = (""+domain.charAt(0)).toUpperCase()+domain.substring(1);

        System.out.println("newFirstName = " + newFirstName);
        System.out.println("newLastName = " + newLastName);
        System.out.println("newDomain = " + newDomain);





    }
}
