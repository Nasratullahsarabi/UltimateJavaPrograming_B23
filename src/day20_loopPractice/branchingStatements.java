package day20_loopPractice;

public class branchingStatements {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < 6; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}