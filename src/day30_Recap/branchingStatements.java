package day30_Recap;

import java.util.Arrays;

public class branchingStatements {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
        int []result = new int[nums.length];

        int j = 0;
        for (int i = nums.length-1; i >= 0 ; i--) {
            result[j++] = nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
