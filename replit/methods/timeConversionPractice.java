package methods;

import java.util.Arrays;

public class timeConversionPractice {
    public static void main(String[] args) {

        String s = "2:59:59PM";
        String military = "";
        if (s.contains("AM") && s.equals("12:00:00AM")){
            military = "00:00:00";
        }else {
            military = s.substring(0,s.length()-2);
        }
        String[] pm = s.split(":");
        int firstIndex = Integer.parseInt(pm[0]);


        if (s.contains("PM") && firstIndex == 12){
            military = (firstIndex)+s.substring(2,s.length()-2);

        }else if (s.contains("PM") && firstIndex < 12){
            military = (firstIndex+12)+":"+pm[1]+":"+pm[2];
            military = military.substring(0,military.length()-2);
        }

        System.out.println(military);



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