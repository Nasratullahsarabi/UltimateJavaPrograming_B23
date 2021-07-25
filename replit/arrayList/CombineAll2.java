package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAll2 {
    public static void main(String[] args) {

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.addAll(Arrays.asList(6,7,8,9,10));

        ArrayList<Integer> combine = new ArrayList<>();

        combine.addAll(n1);
        combine.addAll(n2);

        System.out.println(combine);
    }
}
