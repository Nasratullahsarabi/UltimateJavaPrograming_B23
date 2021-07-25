package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro2 {
    public static void main(String[] args) {
        ArrayList<String> groList = new ArrayList<>();
        groList.add("Egg");
        groList.add("Milk");
        groList.add("Water");
        groList.add("Beer");
        groList.add("Wine");
        groList.add("Bread");

        groList.add(0,"Salt");
        groList.set(0,"Trey");
        groList.set(1,"Soda");

        System.out.println(groList);

        groList.remove("Wine");
        System.out.println(groList);
        groList.remove(3);
        System.out.println(groList);

        boolean remove = groList.remove("Milk");
        System.out.println(groList);

        System.out.println(remove);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);

        nums.remove((Integer)30);
        System.out.println(nums);
        System.out.println(groList);
        groList.clear();
        System.out.println(groList);
        System.out.println("========================================");
        ArrayList<Character> chars = new ArrayList<>();

        chars.add('A');
        chars.add('B');
        chars.add('B');
        chars.add('A');
        chars.add('C');
        chars.add('C');
        chars.add('D');
        chars.add('G');

        ArrayList<Character> uniqueChar = new ArrayList<>();

        for (Character each : chars){
            if (chars.indexOf(each) == chars.lastIndexOf(each)){
                uniqueChar.add(each);
            }
        }

        System.out.println(uniqueChar);
        System.out.println("=====================================");
        ArrayList<Integer> n = new ArrayList<>();
        n.add(4);
        n.add(3);
        n.add(6);
        n.add(4);
        n.add(5);
        n.add(6);

        ArrayList<Integer> uniqueDig = new ArrayList<>();

        for (Integer each : n){
            if (n.indexOf(each) == n.lastIndexOf(each)){
                uniqueDig.add(each);
            }
        }

        System.out.println(uniqueDig);
        System.out.println("==========================================");

        ArrayList<Character> ch = new ArrayList<>();
        ch.add('A');
        ch.add('B');
        ch.add('B');
        ch.add('A');
        ch.add('C');
        ch.add('C');
        ch.add('D');
        ch.add('G');

        ArrayList<Character> uniqueChar1 = new ArrayList<>();

        for (Character each: ch){
            if (ch.indexOf(each)==ch.lastIndexOf(each)){
                uniqueChar1.add(each);
            }
        }
        System.out.println(uniqueChar1);
        System.out.println("========================================");
        ArrayList<String> names = new ArrayList<>();

        names.add("Nasrat");
        names.add("Asad");
        names.add("Ateeq");
        names.add("Wahid");
        names.add("Asad");
        names.add("Ateeq");

        ArrayList<String> uniqueStr = new ArrayList<>();
        String result = "";

        for (String each : names){
            if (names.indexOf(each) == names.lastIndexOf(each)){
                uniqueStr.add(each);
                result+=each+" ";
            }
        }
        System.out.println(uniqueStr);
        System.out.println(result);
    }
}
