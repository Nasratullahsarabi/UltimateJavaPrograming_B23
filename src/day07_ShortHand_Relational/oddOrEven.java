package day07_ShortHand_Relational;

public class oddOrEven {
    public static void main(String[] args) {
        int number = 101;
        boolean even = number%2 == 0;
        boolean odd = number%2 >0; // or number%!=0 or even == false
        System.out.println(number+" is even number: "+even);
        System.out.println(number+" is odd number: "+odd);


    }
}
