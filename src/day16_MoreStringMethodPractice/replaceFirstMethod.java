package day16_MoreStringMethodPractice;

public class replaceFirstMethod {
    public static void main(String[] args) {
        String sentence = "Java is cool, Java is fun";

        sentence = sentence.replaceFirst("Java", "Python");

        System.out.println("sentence = " + sentence);
    }
}
