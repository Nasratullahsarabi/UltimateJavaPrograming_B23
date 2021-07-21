package stringMethod;

public class ifWordStartsWith {
    public static void main(String[] args) {
        String word = "reallu", result = "";

        result = (word.endsWith("ly"))?"really":"never mind";

        System.out.println(result);

    }
}
