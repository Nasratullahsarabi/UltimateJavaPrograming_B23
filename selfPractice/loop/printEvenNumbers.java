package loop;

public class printEvenNumbers {
    public static void main(String[] args) {

        for (int i = 0; i < 30;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++");
        for (int i = 0; i < 26;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
