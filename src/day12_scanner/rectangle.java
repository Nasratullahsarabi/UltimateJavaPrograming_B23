package day12_scanner;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of rectangl");
        int width = scan.nextInt();
        System.out.println("Enter the lengh of rectangle");
        int lengh = scan.nextInt();

        int arae = width*lengh;
        int perimeter =(width+lengh)*2;
        System.out.println("arae = " + arae);
        System.out.println("perimeter = " + perimeter);


    }
}
