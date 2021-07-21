package stringMethod;

public class printWithoutFirstWord {
    public static void main(String[] args) {
        String word = "xschool";

        if (word.startsWith("x")){
            System.out.println(word.substring(1));
        }else {
            System.out.println("word = " + word);
        }
    }
}
