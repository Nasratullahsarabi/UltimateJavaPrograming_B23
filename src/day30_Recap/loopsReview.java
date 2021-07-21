package day30_Recap;

public class loopsReview {
    public static void main(String[] args) {
        String sentence = "I love Java, Java is fun";
        String word = "Java"; int count = 0;
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        System.out.println(count);
    }
}
