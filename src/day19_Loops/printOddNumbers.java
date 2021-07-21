package day19_Loops;

public class printOddNumbers {
    public static void main(String[] args) {
        System.out.println("==print all ood number between 1 - 1000======");

        for(int i = 1; i <=100; i++){
            if (i%2 !=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("==============================");
        for (int i = 1; i <= 100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("======================================");
        for (int i = 1; i < 101; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("hello");

    }
}
