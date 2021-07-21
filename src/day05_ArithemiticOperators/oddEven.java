package day05_ArithemiticOperators;

public class oddEven {
    public static void main(String[] args) {
        /*
        if the remainder of number 2 is equal to zero, then it is even and if it is greater than zero is odd number
         */
        int number = 100;

     boolean isEven = number%2==0;
        boolean isOdd = number%2>0;
        System.out.println(number+"is an even number "+isEven);
        System.out.println(number+"is an even number "+isOdd);



    }
}
