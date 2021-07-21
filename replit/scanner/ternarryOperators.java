package scanner;

import java.util.Scanner;

public class ternarryOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt(); String result = "";

        result = (x>=5)?"x":"-x";

        System.out.println("result = " + result);

    }
}
