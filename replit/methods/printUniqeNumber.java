package methods;

import java.util.Scanner;

public class printUniqeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int []nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }
    public static void printUniqueNumbers(int [] nums){
        String uniqueElement = "";
        for (int i = 0;i < nums.length;i++) {
            int freq = 0;

            for (int element : nums) {

                if (nums[i] == element){
                    freq++;
                }
            }
            if (freq == 1){

                System.out.println(nums[i]);

            }

        }



    }

}
