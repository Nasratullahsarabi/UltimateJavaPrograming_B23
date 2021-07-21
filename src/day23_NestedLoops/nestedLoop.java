package day23_NestedLoops;

public class nestedLoop {
    public static void main(String[] args) {
        String str = "aabcccd";

        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("===================================");
        for (int j = 1; j < 10; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(i+" ");
            }
            System.out.println();


        }


    }
}
