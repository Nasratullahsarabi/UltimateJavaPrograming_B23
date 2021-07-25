package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        String[] str1 = {"f", "o", "o"};
        String[] str2 = {"b", "a", "r"};
        ArrayList<String> combineRs = new ArrayList<>();

        combineRs.addAll(Arrays.asList(str1));
        combineRs.addAll(Arrays.asList(str2));
        System.out.println(combineRs);

    }
}
