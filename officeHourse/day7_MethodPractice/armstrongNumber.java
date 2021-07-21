package day7_MethodPractice;

public class armstrongNumber {
    public static void main(String[] args) {
        int now = 408;
    isArmstrong(now);
    }
    public static boolean isArmstrong(int n){

        int lastDigit = 0;
        int totalDigit = 0;
        int orginalN = n;

        while (0<n){
            lastDigit=n%10;
            n/=10;
            totalDigit+=lastDigit*lastDigit*lastDigit;
        }

        System.out.println(totalDigit == orginalN);
        return true;
    }
}
