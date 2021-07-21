package stringMethod;

import java.awt.datatransfer.FlavorEvent;

public class findInitial {
    public static void main(String[] args) {
        String word = "Cybertek school";

        char firstNameChar = word.charAt(0);
        String result = "";
        int lastNameSpaceIndex = word.indexOf(" ");
        String lastName = word.substring(lastNameSpaceIndex+1);
        char lastNameChar = lastName.charAt(0);

        String initial = firstNameChar+"."+lastNameChar;

        System.out.println(initial.toUpperCase());










    }
}
