package day6_ArraysPractice;

public class longestPalindrom {
    public static void main(String[] args) {
        String []words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalindrom = "";

        for (String each : words) {
            boolean isPalindrom = true;
            String revers = "";
            for (int i = each.length()-1; i >= 0; i--) {

                revers +=each.charAt(i);
            }
         isPalindrom = revers.equalsIgnoreCase(each);

            if (isPalindrom && each.length() > longestPalindrom.length()){
                longestPalindrom = each;
            }
        }

        System.out.println(longestPalindrom);

    }
}
