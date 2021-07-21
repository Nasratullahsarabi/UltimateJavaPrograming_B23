package day16_MoreStringMethodPractice;

public class indexMethod {
    public static void main(String[] args) {
        String sentence = "Java is a cool language";

        int indexOfFirstA = sentence.indexOf("a");
        int indexOfSecondA = sentence.indexOf("a ");
        int indexOfThirdA = sentence.indexOf("a c");
        int indexOfForthA = sentence.indexOf("an"); // ("la")+1
        int indexOfFifthA = sentence.indexOf("ag");
        int indexOfLast = sentence.lastIndexOf("a");

        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfForthA);
        System.out.println(indexOfFifthA);
        System.out.println(indexOfLast);
    }
}
