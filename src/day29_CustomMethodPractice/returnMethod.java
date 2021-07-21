package day29_CustomMethodPractice;

public class returnMethod {
    public static void main(String[] args) {
        String word = "Civic";
        System.out.println(palindrome(word));
        System.out.println(revers(word));

    }
    public static String revers (String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    public static boolean palindrome(String pal){
        String revWord = revers(pal);

        return (revWord.equalsIgnoreCase(pal))?true:false;
    }
}

