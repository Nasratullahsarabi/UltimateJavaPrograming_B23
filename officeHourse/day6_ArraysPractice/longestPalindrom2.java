package day6_ArraysPractice;

public class longestPalindrom2 {
    public static void main(String[] args) {
        String []words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalindrom = "";

        for (int i = 0; i < words.length; i++) {
            String revers = "";
            for (int j = words[i].length()-1; j >= 0; j--) {

                revers+=words[i].charAt(j);
            }
            if (revers.equalsIgnoreCase(words[i])){
                longestPalindrom+=words[i]+" ";
            }
        }
        System.out.print(longestPalindrom);
    }
}
