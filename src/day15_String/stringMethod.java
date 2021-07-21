package day15_String;

public class stringMethod {
    public static void main(String[] args) {
        String str = "Muhtar";

        char ch1 = str.charAt(0);

        System.out.println("ch1 = " + ch1);

        String word = "Cybertekschool";
        char ch2 = word.charAt(9);

        System.out.println("ch2 = " + ch2);
        System.out.println("-------------------------");

        String s = "cybertek";
        s= s.toUpperCase();

        System.out.println(s);
        System.out.println("====================================");

        String s2 = " JAVA PROGRAMING LANGUAGE";
        s2 = s2.toLowerCase();

        System.out.println(s2);

        System.out.println("==================");

        String name = "nasrat";
        name = name.toUpperCase();

        System.out.println(name);
        System.out.println("==================");
        String name1 = "NASRAT";
        name1 = name1.toLowerCase();

        System.out.println(name1);





    }
}
