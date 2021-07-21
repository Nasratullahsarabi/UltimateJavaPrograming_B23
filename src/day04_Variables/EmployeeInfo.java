package day04_Variables;

import sun.font.TrueTypeFont;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Nasrat";
        String lastName = "Sarabi";
        String fullName = firstName + " " +lastName;
        String gender = "Male";
        int age = 26;
        String companyName = "Amazon";
        String jobTitle = "Project Manager";
        boolean isFullTime = true;
        boolean  maritulState = false;
        int salary = 10000;

        System.out.println("Employee full name is: "+fullName);
        System.out.println(fullName+" is "+gender);
        System.out.println(fullName+" is "+age+" years old");
        System.out.println(fullName+" works at "+companyName);
        System.out.println(fullName+" is "+jobTitle );
        System.out.println(fullName+" is full time employee: "+isFullTime);
        System.out.println(fullName+" is married: "+maritulState);
        System.out.println(fullName+" is making $"+salary);




    }
}
