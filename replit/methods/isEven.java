package methods;

import java.util.Scanner;

public class isEven {
    public static boolean isEven (int n){

        return (n%2==0)?true:false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));

        in.close();
    }
}
