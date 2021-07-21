package methods;

import java.util.Scanner;

public class countWordsFreq {
    public static int countApearance(String[] arr, String t){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equalsIgnoreCase(t)){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[]strs = new String[in.nextInt()];
        String word = in.next();
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        System.out.println(countApearance(strs,word));

        in.close();
    }
}
