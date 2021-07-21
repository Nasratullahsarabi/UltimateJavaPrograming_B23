package day21_doWhileLoop;

import java.util.Locale;

public class whileLoopPractice {
    public static void main(String[] args) {
        String sentence = "java java Java JAVA java java";

        int count = 0;

        while (sentence.contains("java")){
            count++;

            sentence = sentence.replaceFirst("java","");


        }
        System.out.println(count);


    }
}
