package loopReplits;

import java.util.Scanner;

public class zombieCity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of pupolation");
        int inhabitant = scan.nextInt();
        int result = 0; int count = 0;
        for (int i = inhabitant; i > 0 ; i--) {
            System.out.println("Day "+count+"["+i+"]");
            i/=2;
            i++; count++;

            if (i == 1){
                System.out.println("---EXTINCTION---");
            }


        }
    }
}