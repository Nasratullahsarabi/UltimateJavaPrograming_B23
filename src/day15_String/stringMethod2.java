package day15_String;

public class stringMethod2 {
    public static void main(String[] args) {

        String sentence = "Java Promming Language";
        String name  = sentence.substring(0,3+1);

        System.out.println(name);
        System.out.println("---------------");

        String s2 = "Cybertek School";
        String name2 = s2.substring(0,7+1); // or 8
        String name3 = s2.substring(9,14+1);// or 15

        System.out.println(name2);
        System.out.println(name3);

        System.out.println("=================");
        String sentence2 = "Java is a programing language";
        String name4 = sentence2.substring(10);
        System.out.println(name4);

    }
}
