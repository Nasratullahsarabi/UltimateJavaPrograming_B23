package loop;

public class palindrome3 {
    public static void main(String[] args) {
        String palindrome = "nadan"; String result = "";

        for (int i = palindrome.length()-1; i >=0;i--){
            result += palindrome.charAt(i);
        }
        boolean isPalindrom = palindrome.equalsIgnoreCase(result);
        System.out.println(isPalindrom);
        System.out.println("========================================");
        String word = "level", result1 = "";
        for (int i = word.length()-1; i >= 0; i--) {
            result1 += word.charAt(i);
        }
        boolean ispal = word.equalsIgnoreCase(result1);

        System.out.println(ispal);
        System.out.println("===================================================");

        String name = "Madam", last = "";
        for (int i = name.length()-1; i >=0;i--){
            last += name.charAt(i);
        }
        boolean isPa = name.equalsIgnoreCase(last);

        System.out.println(isPa);
    }
}
