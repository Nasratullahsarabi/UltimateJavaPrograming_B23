package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);

        list.indexOf('A');
        list.lastIndexOf('A');

        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (Character each: list){
            if (list.indexOf(each) == list.lastIndexOf(each)){
                uniqueChars.add(each);
            }
        }
        System.out.println(uniqueChars);
    }
}
