package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperationMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,12,2,5,2,2,23,3,3,3,4,3,3,3,3,3,4,5,6,7,8,9,1,1,1,1));
        System.out.println(nums);

        //nums.removeAll(Arrays.asList(1));
        //System.out.println(nums);
        nums.retainAll(Arrays.asList(1, 2));
        System.out.println(nums);

        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Delem", "Filip", "Abbos", "Ahmet", "Anderia", "Gabil", "Aliya"));

        //employee.retainAll(Arrays.asList("Ahmet", "Anderia"));
        employee.removeAll(Arrays.asList("Ahmet", "Anderia"));

        System.out.println(employee);
    }

}
