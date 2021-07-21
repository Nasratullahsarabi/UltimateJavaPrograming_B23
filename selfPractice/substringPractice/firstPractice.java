package substringPractice;

public class firstPractice {
    public static void main(String[] args) {
        String sentence = "My favorite TV series is The Walking Dead";

        String s1 = sentence.substring(25,26);
        System.out.println("s1 = " + s1);
        String s2 = sentence.substring(10,13);
        System.out.println("s2 = " + s2);
        String s3 = sentence.substring(12,14);
        System.out.println("s3 = " + s3);
        String s4 = sentence.substring(14,15);
        System.out.println("s4 = " + s4);
        String s5 = sentence.substring(29,36);
        System.out.println("s5 = " + s5);
        String s6 = sentence.substring(36,39);
        System.out.println("s6 = " + s6);
    }
}
