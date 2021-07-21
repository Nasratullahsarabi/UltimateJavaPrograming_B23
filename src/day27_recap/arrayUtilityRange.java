package day27_recap;

import java.util.Arrays;

public class arrayUtilityRange {
    public static void main(String[] args) {

        int[] data ={10,20,30,40,50,60,70,80,90};
        int[] rang = Arrays.copyOfRange(data,2, 7);

        System.out.println(Arrays.toString(rang));

        System.out.println("===================================");



    }

}
