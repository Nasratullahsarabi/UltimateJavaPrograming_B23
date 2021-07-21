package day23_NestedLoops;

public class nestedLoop2 {
    public static void main(String[] args) {

        for (int j = 0; j < 6; j++) {

        for (int i = 0; i < 20; i++) {
            System.out.print("*");
        }
            System.out.println();
        }
        System.out.println("======================================");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
