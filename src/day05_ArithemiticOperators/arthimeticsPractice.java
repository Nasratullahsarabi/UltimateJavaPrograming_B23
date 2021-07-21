package day05_ArithemiticOperators;

public class arthimeticsPractice {
    public static void main(String[] args) {
        int number = 700;
        boolean isEvenlyDevisibleBy3= number%3==0;
        boolean isEvenlyDevisibleBy5= number%5==0; // if the remainder of number/5 is zero then it is even
        /*
        in Java one = means same value equals to
         */
        System.out.println(number+" is evenly devisible by 3 "+isEvenlyDevisibleBy3);
    }
}
