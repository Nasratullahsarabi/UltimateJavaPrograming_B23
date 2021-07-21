package array;

import java.util.Arrays;

public class printInFourLines {
    public static void main(String[] args) {

        String []arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};

        String result = "";

            result = arr[0]+", ";
            result += arr[1]+"\n";
            result+= arr[2]+", ";
            result += arr[3]+" \n";
            result += arr[4]+", ";
            result += arr[5]+"\n";
            result+= arr[6]+", ";
            result += arr[7];

        System.out.println(result);
    }
}
