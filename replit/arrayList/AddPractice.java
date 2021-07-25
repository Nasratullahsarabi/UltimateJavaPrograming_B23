package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6));
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum+=nums.get(i);
        }
        System.out.println(sum);


    }
}
