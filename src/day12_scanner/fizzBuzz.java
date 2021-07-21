package day12_scanner;

import static java.lang.System.*;

public class fizzBuzz {
    public static void main(String[] args) {
        /*
        write a program that can print any number between 1 ~ 10,
        but for number which is a multiple of 3 print "Fizz" instead of
        the number and for number which is a multiple of 5, print "Buzz"
        instead of the number, and for number which is a multiple of both 3
        and 5 both print "FizBuzz" instead of the number.
         */
        int number = 15; String result = "";
        switch (number){
            case 3:
            case 6:
            case 9:
                result = "Fizz";
                break;
            case 5:
            case 10:
                result = "Buzz";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 4:
                result = "Four";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            default:
                result = "Not match";

        }
        out.println(result);

    }
}