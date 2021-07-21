package indexOfPractice;

public class indexOfLast {
    public static void main(String[] args) {
        String phrase = "Afghanistan War";
        int first = phrase.indexOf("i");
        int last = phrase.lastIndexOf("W");
        phrase = phrase.substring(6,11);

        System.out.println("phrase = " + phrase);

        System.out.println(first);
    }
}
