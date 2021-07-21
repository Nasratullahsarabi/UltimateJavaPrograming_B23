package day17_StringPractices;

public class stringMethod {
    public static void main(String[] args) {
        String sentence = "My favorite programming languages are C#, Java, Javascript";

        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.toLowerCase().contains("java"); // if we don not want to consider case sensitivity

        System.out.println(hasJava);
        System.out.println(hasPython);


    }
}
