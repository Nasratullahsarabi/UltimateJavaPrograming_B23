package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("Tomato");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Bread");

        System.out.println(groceryList);

        groceryList.set(0, "Toilet Paper");
        System.out.println(groceryList);
        groceryList.set(3, "Viniger");
        System.out.println(groceryList);
        System.out.println("================================================");

        groceryList.remove(0);
        System.out.println(groceryList);
        groceryList.remove("Tomato");
        System.out.println(groceryList);
    }
}
