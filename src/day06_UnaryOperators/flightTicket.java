package day06_UnaryOperators;

public class flightTicket {
    public static void main(String[] args) {
        /*
        1. create a class named FlightTicket, and declare the following variables:
               from, to, ticketPrice

    use concatenation to display the full info of the ticket
    ex:
            From Las Vegas to McLean is $425.5

2. create a class named LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true

        Hint: if the number of years can be evenly divisible by 4, it's known as the leap year
         */
        String from = "Las Vegas",
                to = "McLand";
        double price = 425.5;
        System.out.println(" From "+from+" to "+to+" is $"+price);
    }
}
