package day4_Practice;

public class printVovolLetters {
    public static void main(String[] args) {
        String word = "afghonistun", result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                result+=ch;
            }
        }
        System.out.print(result);

    }
}
