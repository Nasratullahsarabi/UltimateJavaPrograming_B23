package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListContainMethod {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("Tomato");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Bread");
        groceryList.add("Milk");
        groceryList.add("Tomato");


        boolean hasMilk = groceryList.contains("Milk");
        boolean hasMilk1 = groceryList.indexOf("Milk") > 0;

        System.out.println(hasMilk);
        System.out.println(hasMilk1);

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('r');

        System.out.println(characters);

        ArrayList<Character> result = new ArrayList<>();

        for (char each : characters){
            if (!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);

        for (int i = characters.size()-1; i >= 0 ; i--) {
            System.out.print(characters.get(i)+" ");

        }






    }
}
