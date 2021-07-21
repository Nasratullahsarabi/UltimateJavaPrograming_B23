package day29_CustomMethodPractice;

public class returnMethodPractice {
    public static void main(String[] args) {
        max(10, 30);

    }
    public static int max(int a, int b){
        int max = 0;
        if (a>b){
            max = a;
        }else {
            max = b;
        }
        System.out.println(max);
        return max;
    }
}
