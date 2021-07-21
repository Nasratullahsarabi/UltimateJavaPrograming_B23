package day17_StringPractices;

public class startWithMethod {
    public static void main(String[] args) {

        String sentence = "Cybertek School is the best";

        boolean startWith = sentence.startsWith("Cybertek");
        boolean startWithSchool = sentence.startsWith("School");

        System.out.println(startWith);
        System.out.println(startWithSchool); // false because it deosnt start with school

    }
}
