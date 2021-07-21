package array;

import java.util.Arrays;

public class zombiAttack3 {
    public static void main(String[] args) {
        int [] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
        int largestPop = inhabitants[0];

        for (int i = 0; i < inhabitants.length; i++) {

            if (inhabitants[i] > largestPop){
                largestPop = inhabitants[i];
            }
        }
        int days = 0;

        while (largestPop > 0) {
            System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
            days++;
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] /= 2;
            }
            largestPop/=2;
        }

            System.out.println("Day "+days+" "+Arrays.toString(inhabitants));

        System.out.println("---- EXTINCT ----");


    }
}