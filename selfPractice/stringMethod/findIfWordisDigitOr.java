package stringMethod;

public class findIfWordisDigitOr {
    public static void main(String[] args) {
        String word = "2afghanistan";
        char firstCharacter = word.charAt(0);
        if (firstCharacter >='0' && firstCharacter <='9' ){
            System.out.println("digit");
        }else if (firstCharacter >= 'a' && firstCharacter <='z'){
            System.out.println("lowercase");
        }else if (firstCharacter >= 'A' && firstCharacter <='Z'){
            System.out.println("upper case");
        }else {
            System.out.println("special character");
        }
    }
}
