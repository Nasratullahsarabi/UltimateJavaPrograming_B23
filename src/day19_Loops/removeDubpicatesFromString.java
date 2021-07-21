package day19_Loops;

public class removeDubpicatesFromString {
    public static void main(String[] args) {
        String word = "ababababvcdsgva";
        String result = "";
        for (int i = 0; i < word.length(); i++) { // int 1 = 0; i <=word.lengh()-1; i++
            if (!result.contains("" + word.charAt(i))) {

                result += word.charAt(i);

            }
        }
        System.out.println("result = " + result);
    }
}