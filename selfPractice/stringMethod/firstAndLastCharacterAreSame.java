package stringMethod;

public class firstAndLastCharacterAreSame {
    public static void main(String[] args) {
        String word1 = "shamshad";
        if (word1.charAt(0) == word1.charAt(word1.length()-1)){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }
    }
}
