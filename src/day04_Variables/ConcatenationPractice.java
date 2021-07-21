package day04_Variables;

public class ConcatenationPractice {
    public static void main(String[] args) {
        /*
        addition: when we have two munbers

        10 + 10 = 20

        concatenation: when there is at least one string
        "10"+"10"=1010
        1+"10"=110
        "2"+3=23

         */
        String word = "Python";
        System.out.println("My favorite language is "+word+" Programing Language");
        System.out.println("---------------------------");

        int dollar = 100;
        double lira = dollar * 8.41;
        double euro = dollar* 0.88;

        System.out.println(dollar+" US dollar qual to "+lira+" Turkish lira");
        System.out.println(dollar+" US dollar equal to "+euro+" Euro");
        System.out.println("-----------------");
        int a = 10;
        int b= 20;
        int addition = a+b;
        int subtraction =a-b;
        int multiplication=a*b;

        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(a+" + "+b+" = "+ addition);
        System.out.println(a+" - "+b+" = "+subtraction);
        System.out.println(a+" * "+b+" = "+multiplication);
    }
}
