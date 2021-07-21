package day6_ArraysPractice;

public class findingPalindromes {
    public static void main(String[] args) {
        String []words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrom = "";
        for (int i = 0; i < words.length; i++) {
            String reversed = "";
            boolean isPalindrom = true;
            for (int j = words[i].length()-1; j >= 0 ; j--) {
                reversed+=words[i].charAt(j);
            }
            isPalindrom = reversed.equalsIgnoreCase(words[i]);
            if (isPalindrom && words[i].length() > longestPalindrom.length()){
                longestPalindrom = words[i];
            }
        }
        System.out.println(longestPalindrom);
    }
}
