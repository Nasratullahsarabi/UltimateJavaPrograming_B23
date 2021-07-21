package methods;

import java.util.Scanner;

public class maxNumber {
    public static int max(int x, int max){

        return (max > x)?max:x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));


        in.close();
    }
}
