package day21_doWhileLoop;

public class letterDigitSpecialChar {
    public static void main(String[] args) {

        String input = "mn@#123AB!";

        String letters = "";
        String digits = "";
        String specialCh = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
                letters+=ch;
            }else if (ch >= '0' && ch <= '9'){
                digits+=ch;
            }else {
                specialCh+=ch;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCh = " + specialCh);

    }
}
/*
 write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */