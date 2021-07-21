package loopReplits;

public class findTripleChars {
    public static void main(String[] args) {
        String word = "aaaaabbbbbbcccc";
        int freq = 0; String result = "";

        for (int i = 0; i < word.length() - 2; i++) {

            if (word.charAt(i) == word.charAt(i+1) && word.charAt(i) == word.charAt(i+2))
                freq++;

        }

        System.out.print(freq);
        }


    }

