package day08_MethodOverLoading;

public class SecondPractice {
    public static void main(String[] args) {


    }
    public static void fibo(int number){
        int p2 = 0;
        int p1 = 1;
        int result = 0;

        for (int i = 0; i < number; i++) {
            result = p1+p2;
            System.out.println(result);
            p2=p1;
            p1=result;

        }
    }
}
/*
Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

                Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                    Ex:
                        Input:
                            8
                        Output:
                            0, 1, 1, 2, 3, 5, 8, 13, 21

 */