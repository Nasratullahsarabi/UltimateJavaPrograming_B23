package arrayPractice;

import java.util.Arrays;

public class findUniqeElement {
    public static void main(String[] args) {
        String[]arr = {"b", "m", "a", "v", "a","j","v"};
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])){
                    count++;
                    result+=arr[i];
                }
            }
            if (count == 1){
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        System.out.println(result);
    }
}
