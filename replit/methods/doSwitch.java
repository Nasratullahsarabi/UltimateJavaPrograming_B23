package methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class doSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int []arr = {in.nextInt(),in.nextInt(),in.nextInt()};
        System.out.println(Arrays.toString(do_switch(arr)));
    }
    public static int[] do_switch(int[]i){
        int temp = i[0];
        i[0] = i[i.length-1];
        i[i.length-1] = temp;


        return i;
    }
}
