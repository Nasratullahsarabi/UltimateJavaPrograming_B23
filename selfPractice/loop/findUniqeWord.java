package loop;

public class findUniqeWord {
    public static void main(String[] args) {
        String word = "aaabbbcccd"; String result = "";

        for (int i = 0; i <= word.length()-1; i++) {
            char ch = word.charAt(i);
            boolean isUniqe = word.indexOf(ch) == word.lastIndexOf(ch);

            if (isUniqe){
                result += ch;
            }

        }
        System.out.println(result);
    }
}
