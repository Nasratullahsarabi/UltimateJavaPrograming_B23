package day5;

public class camelCase {
    public static void main(String[] args) {
        String str = "ThisHasManyWordsToFind";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >='A' && str.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
