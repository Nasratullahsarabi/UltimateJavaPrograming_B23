package day11_switch;

public class culculater {
    public static void main(String[] args) {
        double n1 = 100, n2 = 2.5, result = 0; char operator ='/';

        switch (operator){
            case '-':
                result=(n1-n2);
                break;
            case '+':
                result=(n1+n2);
                break;
            case '*':
                result=(n1*n2);
                break;
            case '/':
                result=(n1/n2);
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("result = " + result);
    }
}
