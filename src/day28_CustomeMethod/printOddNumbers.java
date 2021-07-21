package day28_CustomeMethod;

public class printOddNumbers {
    public static void main(String[] args) {
        oddNumber();


    }
    public static void oddNumber(){
        for (int i = 1; i <= 100; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }

        }
    }
}
