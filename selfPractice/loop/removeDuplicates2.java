package loop;

import java.util.Scanner;

public class removeDuplicates2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next(), result = "";

        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(""+word.charAt(i))){
                result+=word.charAt(i);
            }

        }
        System.out.println(result);

        scan.close();
    }
}
