package replaceMethod;

public class firstPractice {
    public static void main(String[] args) {
        String email = "Nasratullah_sarabi@yahoo.com";

        email = email.replace("Nasratullah","Freshta");
        System.out.println("email = " + email);
        email = email.replace("sarabi","saraabi");
        System.out.println("email = " + email);
        email = email.replace("yahoo","gmail");
        System.out.println("email = " + email);
        email=email.replace("saraabi","sarabi");
        System.out.println("email = " + email);

    }
}
