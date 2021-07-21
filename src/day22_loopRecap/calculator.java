package day22_loopRecap;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0, num2 = 0; char operator; String answer = "";

        while (!answer.equals("no")){
            System.out.println("enter two numbers");
            num1 = scan.nextInt();
            num2 = scan.nextInt();

            System.out.println("enter math operator");
            operator = scan.next().charAt(0);

            if (operator == '-'){
                System.out.println("Subtraction: "+(num1-num2));
            }else if (operator == '+'){
                System.out.println("Addition: "+(num1+num2));
            }else if (operator == '*'){
                System.out.println("Multiplication: "+(num1*num2));
            }else if (operator == '/'){
                System.out.println("Divistion: "+ (num1/num2));
            }else {
                System.out.println("invalid operator");
            }
            System.out.println("Do you wanna continue?");
            answer = scan.next();

            while ( !  (answer.equals("yes")||answer.equals("no"))  ) {
                System.out.println("Invalid entry, please re-try");
                System.out.println("Do you wanna continue?");
                answer = scan.next();
            }

        }

        scan.close();


    }
}
