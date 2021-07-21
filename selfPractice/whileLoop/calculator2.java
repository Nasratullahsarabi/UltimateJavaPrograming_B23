package whileLoop;

import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = ""; char operator; int num1, num2;

        while (!answer.equals("no")){
            System.out.println("Enter two numbers:");
            num1 = scan.nextInt(); num2 = scan.nextInt();
            System.out.println("Enter math opertor");
            operator = scan.next().charAt(0);

            if (operator == '-'){
                System.out.println(num1-num2);
            }else if (operator == '+'){
                System.out.println(num1+num2);
            }else if (operator == '*'){
                System.out.println(num1*num2);
            }else if (operator == '/'){
                System.out.println(num1/num2);
            }else {
                System.out.println("invalid operator, enter the accurate operator");
            }
            System.out.println("Do you want to continue?");
            answer = scan.next();
            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("invalid entry, please enter accurate operator");
                answer = scan.next();
            }

        }
        scan.close();
    }
}
