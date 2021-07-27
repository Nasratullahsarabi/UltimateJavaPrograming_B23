package day36_ArrayListPractice;

import java.util.ArrayList;

public class WarmUpTask4 {
    public static void main(String[] args) {
        int[]numbers = {1,2,3,4,5,6,7};

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : numbers){
            list.add(each);
        }
        System.out.println(list);
    }
}
