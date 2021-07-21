package statements;

public class oddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = -5;
        System.out.println(num);
        if(num%2==0){
            System.out.println(num+" is an even number");
        }
        if (num%2>0 || num%2<0){
            System.out.println(num+" is an odd number");
        }
    }
}
