package methods;

import java.util.Arrays;

public class timeConversionPractice {
    public static void main(String[] args) {

        String s = "12:00:00AM"; //  00:00:00
        String m = "00:00:00";
        int hour = 12,
                minute = 00,
                second = 00,
                mHour = 00;

        String[]str = s.split(":");
        String hourAM = str[0];
        String minuteAM = str[1];
        String secondAM = str[2];


        if (s.contains("AM") && str[0].equals("12")){
            m = "00:00:00";
        }else {
            m = s.substring(0,s.length()-2);
        }

        if (s.contains("PM") && str[0].equals("12")){
            m = "12:00:00";
        }
        if (s.contains("PM")){

        }

        System.out.println(m);


    }
}


/*
Task3:
    1. create method that accepts one integer array and one integer number and returns the frequency of the number
                Ex:
                    int[] array ={1,1,1,1,1,2,2};

                    frequency(array, 2) ==> 5


    2. create method that accepts one double array and one double number and returns the frequency of the number


    3. create method that accepts one String array and one String and returns the frequency of the String
            Ex:
                String[] array = {"Apple", "Apple", "Apple", "Orange"}

                frequency(array, "Orange") ==> 1

    4. create method that accepts one char array and a char and returns the frequency of the char

Task4:
    1. create a method that can remove the duplicates from an array of integer
        Ex:
          int[] array = {1,1,1,2,2,2,3,4,5,5,5};
          removeDup(array);  ===> {1,2,3,4,5}

    2. create a method that can remove the duplicates from an array of double

    3. create a method that can remove the duplicates from an array of String

    4. create a method that can remove the duplicates from an array of char
        HINT: how did you remove the duplicates from a string?
 */