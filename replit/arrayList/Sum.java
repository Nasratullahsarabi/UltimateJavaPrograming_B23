package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    public static ArrayList<Integer> appendPostSum (ArrayList<Integer> nums){

        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
         if (nums.get(i) > 0) {
             result.add(nums.get(i));
             sum += nums.get(i);
         }
        }
        result.add(sum);
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> sum = new ArrayList<>();

        sum.addAll(Arrays.asList(1,2,3,-5,4,-9,-5));

        System.out.println(appendPostSum(sum));
    }
}
