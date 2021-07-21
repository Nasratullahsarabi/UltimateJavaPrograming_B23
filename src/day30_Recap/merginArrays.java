package day30_Recap;

import java.util.Arrays;

public class merginArrays {
    public static void main(String[] args) {
        String group1[] = {"Sophie","Feruza","Ekaterina"};
        String group2[] = {"Shazia","Danka","Muchaiet","Bilgun"};

        String group3[] = new String[group1.length+ group2.length];
        int j = 0;
        for (int i = 0; i < group1.length; i++) {

            group3[j++] = group1[i];
        }
        for (int i = 0; i < group2.length; i++) {
            group3[j++] = group2[i];
        }

        System.out.println(Arrays.toString(group3));
        System.out.println("=============================================================");


    }
}
