package day31_Recap;

public class warmUpTask2 {
    public static void main(String[] args) {
        String sentence = "Java java JaVA is the best Java I love you";
        sentence = sentence.toLowerCase();
        String word = "java";
        int count = 0;

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        System.out.println(count);
    }
}
