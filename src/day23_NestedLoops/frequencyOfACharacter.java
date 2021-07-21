package day23_NestedLoops;

public class frequencyOfACharacter {
    public static void main(String[] args) {
        String str = "aabcccd"; char ch = 'a'; int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (each == ch){
                frequency++;

            }
        }
        System.out.println(frequency);
    }
}
/*
Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
 */