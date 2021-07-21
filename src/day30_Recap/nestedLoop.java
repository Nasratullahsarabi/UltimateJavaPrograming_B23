package day30_Recap;

public class nestedLoop {
    public static void main(String[] args) {
        String word = "aaaabbbdddjllllfiiik";

        for (int j = 0; j < word.length(); j++) {

        char ch = word.charAt(j);
        int freq = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                freq++;
            }
        }
        if (freq == 1){
            System.out.println(ch);
        }
    }
    }
}
