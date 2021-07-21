package array;

public class splitASentence {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        String []split = sentence.split(" ");

        for (String each : split) {

            System.out.println(each);

        }
    }
}
