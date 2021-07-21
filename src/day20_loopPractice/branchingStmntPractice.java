package day20_loopPractice;

public class branchingStmntPractice {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i);
        }
        System.out.println("===================================");
        for (int i = 0; i < 16; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("===================================");
        for (int i = 1; i < 100; i++) {
            if (i % 15 !=0) {
                continue;
            }
            System.out.println(i+" ");

        }
    }
}