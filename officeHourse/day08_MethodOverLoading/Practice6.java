package day08_MethodOverLoading;

public class Practice6 {
    public static void main(String[] args) {
        int number = 8;
        int num0 = 0;
        int num1 = 1;
        int result = 0;
        System.out.println(num0);
        for (int i = 0; i < number-1; i++) {
            result=num1+num0;
            System.out.println(result);
            num0=num1;
            num1=result;
        }
    }
}