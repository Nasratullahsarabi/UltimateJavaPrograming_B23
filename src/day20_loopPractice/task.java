package day20_loopPractice;

public class task {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z';i++){

            if (i == 'c' || i == 'k' || i == 'g'){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=========================================");
        for (int i = 1; i < 25;i++){
            if (i == 3 || i == 5){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
