package indexOfPractice;

public class indexFirstPractice {
    public static void main(String[] args) {
        String url = "www.cybertek.gov";

        int beginning = url.indexOf(".");
        int ending = url.lastIndexOf(".");

        System.out.println("beginning = " + beginning);
        System.out.println("ending = " + ending);

        System.out.println("============================");

        String sentence = "I have studied English in Afghanistan";

        int index = sentence.indexOf("g");
        int index1 = sentence.indexOf("i");
        int index2 = sentence.lastIndexOf("i");

        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);

    }
}
