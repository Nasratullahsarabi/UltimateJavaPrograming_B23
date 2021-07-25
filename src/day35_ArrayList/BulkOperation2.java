package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,5,6,7,8,8,2,3,4,54,3,9));

        System.out.println(nums);
        System.out.println("================================================");
        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Asad", "Nasrat", "Wahid", "Ateeq", "Nasrat", "Jawad", "Nasrat"));

        names.removeAll(Arrays.asList("Nasrat", "Jawad"));
        System.out.println(names);

        ArrayList<Integer> num1 = new ArrayList<>();

        num1.addAll(Arrays.asList(1,2,3,4,5,5,6,7,8,8,2,3,4,4,3,9,2,2,2,2,4));

        //num1.removeAll(Arrays.asList(2,4,3));
        num1.retainAll(Arrays.asList(3,8));
        System.out.println(num1);
    }
}
