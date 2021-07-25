package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum1 {
    public static void main(String[] args) {
        ArrayList<Integer> sum = new ArrayList<>();

        sum.addAll(Arrays.asList(1,2,3,-5,4,-9,5));

        ArrayList<Integer> result = new ArrayList<>();

        int sum1 = 0;
        for (int i = 0; i < sum.size(); i++) {

            if (sum.get(i) >= 0){
                result.add(sum.get(i));
                sum1+=sum.get(i);
            }
        }

        result.add(sum1);

        System.out.println(result);
    }
}
