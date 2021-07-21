package day28_CustomeMethod;

public class voidMethodPractice {
    public static void main(String[] args) {

        ovenNumbers(3, 10);
        oddNumbers(4, 10);
        calculateAge(1983,2025);
        voteEligibility(28, true);
        calculator(3,'*', 4);


    }
    public static void oddNumbers(int from, int to){
        for (int i = from; i <= to ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    public static void ovenNumbers(int from, int to){
        for (int i = from; i <= to ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void calculateAge(int birthYear, int currentYear){
        System.out.println("Your age is: "+(currentYear - birthYear));

    }

    public static void voteEligibility(int age, boolean isUScitizen){
        if (age >=21 && isUScitizen){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void calculator(int num1, char operator, int num2){
        switch (operator){
            case '-':
                System.out.println("subtruction: "+(num1-num2));
                break;
            case '+':
                System.out.println("addition: "+(num1+num2));
                break;
            case  '*':
                System.out.println("multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println("division: "+(num1/num2));
            case '%':
                System.out.println("remainder: "+(num1%num2));
            default:
                System.out.println("invalid operator");

        }
    }

}
