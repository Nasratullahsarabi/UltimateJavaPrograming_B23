package day29_CustomMethodPractice;

public class returnMethod2 {
    public static void main(String[] args) {
        String word = "Civic";
        palindrom(word);
        reverse(word);

    }
    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result+=str.charAt(i);

        }
        System.out.println(result);
        return result;
    }

    public static void palindrom (String str1){
        String revWord = reverse(str1);

        if (revWord.equalsIgnoreCase(str1)){
            System.out.println(str1+ " is palindrome");
        }else {
            System.out.println(str1+ " is not palindrome");
        }
    }

}
