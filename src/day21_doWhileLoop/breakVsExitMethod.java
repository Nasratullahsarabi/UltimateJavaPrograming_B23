package day21_doWhileLoop;

public class breakVsExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            if (i==3){
                break;
            }
            System.out.println("cybertek school");

        }
        System.out.println("batch23");
        System.out.println();
        System.out.println("===========================");

        for (int i = 0; i < 5 ; i++) {
            if (i==3){
                System.exit(0);
            }
            System.out.println("cybertek school");

        }
        System.out.println("batch23");
    }
}
