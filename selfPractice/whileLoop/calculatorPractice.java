package whileLoop;
import java.util.Scanner;
public class calculatorPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = ""; char operator; int num1, num2;

        while (!answer.equals("no")){
            System.out.println("two number & operator");
            num1 = scan.nextInt(); num2 = scan.nextInt(); operator = scan.next().charAt(0);

            if (operator == '-'){
                System.out.println(num1-num2);
            }else if (operator == '+'){
                System.out.println(num1+num2);
            }else if (operator == '*'){
                System.out.println(num1*num2);
            }else if (operator == '/'){
                System.out.println(num1/num2);
            }else {
                System.out.println("invalid, reenter");
            }
            System.out.println("contineu?");
            answer = scan.next();

            while ( !(answer.equals("yes") || answer.equals("no"))){
                System.out.println("invalid, reenter");
                answer = scan.next();
            }
        }

        scan.close();

    }
}
