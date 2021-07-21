package array;

import java.util.Arrays;

public class reversAnArray {
    public static void main(String[] args) {

        int []nums = {4, 3, 2, 44, 1, 100, 55};

        for (int i = nums.length-1; i >= 0;i--){

            int temp = nums[0];
            nums[0] = nums[nums.length-1];
            nums[nums.length-1] = temp;

            temp = nums[1];
            nums[1] = nums[nums.length-2];
            nums[nums.length-2] = temp;

            temp = nums[2];
            nums[2] = nums[nums.length-3];
            nums[nums.length-3] = temp;
        }
        System.out.println(Arrays.toString(nums));

    }
}
