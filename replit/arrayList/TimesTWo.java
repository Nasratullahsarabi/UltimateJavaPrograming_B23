package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TimesTWo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            result.add(nums.get(i)*2);
        }
        System.out.println(result);
    }

}
