package day07_ShortHand_Relational;

public class positiveNegativeZero {
    public static void main(String[] args) {
        int number = -100;
        boolean isPositive = number >0;
        boolean isNegative = number <0;
        boolean isZero = number == 0;
        /*
        or
        boolean isZero = isNegative == false && isPositive == false;
         */

        System.out.println(number+" is a positive number "+isPositive);
        System.out.println(number+" is a negative number "+isNegative);
        System.out.println(number+" is zero number "+isZero);

    }
}
