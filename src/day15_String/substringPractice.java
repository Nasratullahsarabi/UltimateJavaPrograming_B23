package day15_String;

public class substringPractice {
    public static void main(String[] args) {
        String sentence = "My favorite TV series is The Walking Dear";
        String tvSeries = sentence.substring(25);

        System.out.println(tvSeries);

        String sentence2= "Java is a fun language";

        String s1 = sentence2.substring(10,13);

        System.out.println(s1);
        System.out.println("---------------------------");

        String sentence3 = "Python is an easy language";
        sentence3.replace("Python", "Java");

        String sentence4 ="C# is a programing launagauge, I like learning C#, C# is the best";

        sentence4 = sentence4.replace("C#", "Java");

        System.out.println(sentence4);

        String sentence5 = " Dog is friendly , Dog is loyal, I love Dogs";

        sentence5= sentence5.replace("Dog", "Cat");

        System.out.println(sentence5);
    }
}
