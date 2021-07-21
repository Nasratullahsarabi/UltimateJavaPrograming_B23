package day14_Recap;

public class letterOrDigitOrSpecialChar {
    public static void main(String[] args) {


        char ch = '&';

        boolean isDigit = ch >= '0' && ch <= '9';
        boolean isLetter =ch >='A' && ch <= 'A' || ch>='a' && ch <='z';
        String result = "";
        if (isDigit){
            result = ch + " is digit";
        }else if (isLetter){
            result = ch+" is letter";
        }else {
            result = ch + "is special character";
        }
        System.out.println(result);
    }
}
