package day23_NestedLoops;

public class removDuplicates {
    public static void main(String[] args) {
        String word = "lajllkkkkaaa";
        String remDup = "";

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);

            if (remDup.contains("" + each)) {
                continue;
            }
            remDup+=each;
        }
        System.out.println(remDup);
    }
}
