package day12_scanner;

import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your hourly rate?");
        double hourlyRate = scan.nextDouble();
        System.out.println("how many hours do you work in a week?");
        int weeklyHour = scan.nextInt();
        System.out.println("how many weeks do you work in a year");
        int weeksinAYear = scan.nextInt();
        double salary = hourlyRate*weeklyHour*weeksinAYear;
        System.out.println("you are making $"+hourlyRate+" per hour");
        System.out.println("you work "+weeklyHour+" hours in a week");
        System.out.println("you salary is: $"+salary);

        /*
        ask the user to enter:
        1. hourly rate
        2. how many hours do you work in a week
        3. how many weeks do you work in a year
         */
    }
}
