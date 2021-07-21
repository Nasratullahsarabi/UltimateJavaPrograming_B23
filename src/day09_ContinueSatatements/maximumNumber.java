package day09_ContinueSatatements;

public class maximumNumber {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 30;

        if (num1>num2){
            System.out.println(num1+" is the maximum number");
        }
        if (num2>num1){
            System.out.println(num1+" is the minmum number");
        }
        System.out.println("-------------------------");
        if (num1>num2){
            System.out.println(num1+ " is maximum");
        }else{
            System.out.println(num2+ " is minimum");
        }
    }
}
