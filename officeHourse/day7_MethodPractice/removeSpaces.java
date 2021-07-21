package day7_MethodPractice;

import java.util.Arrays;

public class removeSpaces {
    public static void main(String[] args) {

        String sentence = "  Hello world      I      love      Java    ";

        removeSpaces(sentence);
    }
    public static void removeSpaces (String sentence){

        String result = "";
        String arr[] = sentence.trim().split(" ");

        for (String s : arr) {

            if (!s.isEmpty()){
                result+=s+" ";
            }
        }
        System.out.println(result);
    }
}
