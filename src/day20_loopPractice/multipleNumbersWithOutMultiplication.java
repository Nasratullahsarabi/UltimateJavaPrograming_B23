package day20_loopPractice;

public class multipleNumbersWithOutMultiplication {
    public static void main(String[] args) {
        int a = 10, b = 5;

        int equal = 0;

        for (int i = 0; i < b; i++) {
            equal+=a;

        }
        System.out.println(equal);
    }
}
