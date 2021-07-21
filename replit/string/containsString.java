package string;

import java.util.Locale;

public class containsString {
    public static void main(String[] args) {
        String sentence = "I have a Word to say";

        System.out.println(sentence.toLowerCase(Locale.ROOT).contains("word"));
    }
}
