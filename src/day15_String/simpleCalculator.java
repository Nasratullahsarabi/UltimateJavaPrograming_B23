package day15_String;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter your number");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number");
        double num2 = scan.nextDouble();
        System.out.println("Enter a math Operator");
        char mathOperator = scan.next().charAt(0);

        double result = 0;

        switch (mathOperator){
            case '-':
                result = num1-num2;
                break;
            case '+':
                result = num1+num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }
        System.out.println(result);
    }
}
