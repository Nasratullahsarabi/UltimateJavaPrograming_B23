package statements;

import java.util.Scanner;

public class patientPortal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal inforamtion");
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email address");
        String email = scan.next();
        scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhone = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        boolean isMarried = scan.nextBoolean();

        String contactInfo = "work phone number - "+workPhone+", personal phone number - "+personalPhone+", email:"+email;
        String personalInfo = firstName+", "+lastName;
        String add = street+","+city+","+state+" "+zipCode;

        System.out.println("Patient personal iformation Full name:"+personalInfo+" Address: "+add+" Contacts:"+contactInfo+
                " Age:"+age+ "Height:"+height+" Weight: "+weight+ "pounds Married: "+isMarried);

        scan.close();
    }
}
