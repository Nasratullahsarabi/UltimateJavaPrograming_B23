package day06_UnaryOperators;

public class leapYear {
    public static void main(String[] args) {
        /*
        2. create a class named LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true

        Hint: if the number of years can be evenly divisible by 4, it's known as the leap year
         */
        int year = 2000;
        boolean isLeapYear = year%4==0; //if the year is evenly divisible by 4, then it is a leap year
        System.out.println(year+" is a leap year: "+isLeapYear);
    }
}
