package day36_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> list2 = new ArrayList<>(list);
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i)%2!=0){
                list2.set(i, list2.get(i)*2);
            }

        }
        System.out.println(list2);
    }
}

/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */
