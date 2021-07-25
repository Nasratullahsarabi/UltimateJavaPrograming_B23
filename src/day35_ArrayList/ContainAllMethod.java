package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainAllMethod {
    public static void main(String[] args) {
        ArrayList<String> grocceryList = new ArrayList<>();
        grocceryList.addAll(Arrays.asList("Soda", "Milk", "Wine", "Beer", "Eggs", "Bread", "Water"));

        boolean r = grocceryList.containsAll(Arrays.asList("Soda", "Eggs", "Wine", "coffee"));

        System.out.println("r = " + r);
    }
}
