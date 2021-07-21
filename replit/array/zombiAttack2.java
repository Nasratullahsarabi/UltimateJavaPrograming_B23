package array;

import java.util.Arrays;

public class zombiAttack2 {
    public static void main(String[] args) {
        int [] inhabitants = {10, 5, 0, 0, 4, 7, 6, 2};
        int largestPop = inhabitants[0];

        for (int i = 0; i < inhabitants.length; i++) {

            if (inhabitants[i] > largestPop){
                largestPop = inhabitants[i];
            }
        }
        int days = 0;
        System.out.println("Day "+days+" "+Arrays.toString(inhabitants));

        for (int j = 0; j < largestPop/2; j++) {
            days++;
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i]/=2;
        }
            System.out.println("Day "+days+" "+Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");


    }
}