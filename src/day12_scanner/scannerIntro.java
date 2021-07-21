package day12_scanner;
import java.util.Scanner;
public class scannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int addition = num1+num2;
        int subtraction = num1-num2;
        int multiplication = num1*num2;
        int devision = num1/num2;
        System.out.println("addition = " + addition);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("devision = " + devision);
    }
}
