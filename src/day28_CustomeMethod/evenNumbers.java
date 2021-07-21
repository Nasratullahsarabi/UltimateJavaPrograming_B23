package day28_CustomeMethod;

public class evenNumbers {
    public static void main(String[] args) {

        evenNum();

    }
    public static void evenNum(){

        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
    }
}
