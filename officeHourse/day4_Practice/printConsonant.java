package day4_Practice;

public class printConsonant {
    public static void main(String[] args) {
        String word = "afehaniston", result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ( !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
              continue;
            }
            System.out.print(ch);
        }

    }
}
