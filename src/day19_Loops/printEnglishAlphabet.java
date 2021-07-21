package day19_Loops;

public class printEnglishAlphabet {
    public static void main(String[] args) {

        String upperCase = "", lowerCase = "";

        for (int i = 65; i <= 90; i++) { // A = 65 in ascii table

            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("==========================================");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("==================");
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("==================");
        for (char i = 'a'; i < 'z' ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("==================");

        for (char i = 1000; i <=30000 ; i++) {
            System.out.print(i+" ");

        }
    }
}
