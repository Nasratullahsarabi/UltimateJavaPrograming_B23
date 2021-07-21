package loop;

public class printOddNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {

            if (i % 2 !=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println("========================");
        for (int i = 0;i <= 20;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
