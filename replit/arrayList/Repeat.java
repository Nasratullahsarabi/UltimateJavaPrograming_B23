package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Repeat {
    public static void main(String[] args) {
        ArrayList<Boolean> r = new ArrayList<>();

        r.addAll(Arrays.asList(true,false,false));

        ArrayList<Boolean> r1 = new ArrayList<>();
        r1.addAll(r);
        r1.addAll(r);

        System.out.println(r1);

    }
}
