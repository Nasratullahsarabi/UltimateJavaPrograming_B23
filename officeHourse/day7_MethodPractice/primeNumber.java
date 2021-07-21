package day7_MethodPractice;

public class primeNumber {
    public static void main(String[] args) {

        for (int i = 0; i < 110; i++) {

            System.out.print(isPrime(i)?i+" ":"");
        }

    }
    public static boolean isPrime(int n) {

        if (n < 2){
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n%2==0){
                return false;
            }
        }
        return true;
    }
}
