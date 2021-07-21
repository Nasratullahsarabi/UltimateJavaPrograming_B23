package array;

import java.util.Arrays;
import java.util.Scanner;

public class addToArray2 {
    public static void add_To_r(int[] r, int n){
        int merge[] = Arrays.copyOf(r, r.length+1);
        merge[merge.length-1] = n;

        System.out.println(Arrays.toString(merge));


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt(), n = scan.nextInt();
        int []arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        add_To_r(arr, n);

    }
}
