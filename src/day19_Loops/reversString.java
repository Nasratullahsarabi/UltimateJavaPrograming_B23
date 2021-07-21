package day19_Loops;

public class reversString {
    public static void main(String[] args) {
        String name = "Muhtar";
        for (int i = 0; i <= 5; i++) {

            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println("======================================");

        for (int i = 5; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }

    }
}
