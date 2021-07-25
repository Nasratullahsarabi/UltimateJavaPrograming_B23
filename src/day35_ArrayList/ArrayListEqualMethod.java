package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListEqualMethod {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

    }
}
