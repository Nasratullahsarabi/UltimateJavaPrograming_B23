package array;

public class longestArray {
    public static void main(String[] args) {
        String[] word = {"aart", "ju", "wuy", "lo", "ta"};
        String result = "";

        for (int i = 0; i < word.length; i++) {

            if (word[i].length() > result.length())

                result = word[i];
        }
        System.out.println(result);
    }
}