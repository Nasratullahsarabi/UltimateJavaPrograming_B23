package quize;

import java.util.Arrays;

public class quize {
    public static void main(String[] args) {

        int num = 5;
        while (isAvaialable(num)){
            System.out.println(num);
            --num;
        }


    }
    public static boolean isAvaialable(int num){
        return (num-- > 0)?true:false;
    }
}
