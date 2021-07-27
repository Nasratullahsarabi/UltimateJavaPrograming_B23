package day36_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,1,1,1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,78,8));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5){
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println("===========================================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,1,1,1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,78,8));

        //list2.removeIf(p -> p < 5);
        //list2.removeIf(p -> p%2!=0);
        list2.removeIf(p -> p%2==0);

        System.out.println(list2);
        System.out.println("==================================================");
        ArrayList<String> str = new ArrayList<>();

        str.addAll(Arrays.asList("Nasrat", "Asad", "Javad", "Ateeq", "Javad", "Asad", "Wahid"));

        str.removeIf(p -> p.contains("d"));

        System.out.println(str);
        System.out.println("=================================================");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Anna", "Racecar", "Level", "Java", "Naqib", "Python", "Madam"));


    }
}
