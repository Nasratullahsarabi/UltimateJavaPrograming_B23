package methods;

import java.util.Scanner;

public class printUniqueWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[]words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);

    }
    public static void printUniqueWords(String[]words){

        for (String each : words) {
            int count = 0;
            for (String element : words){

                if (each.equalsIgnoreCase(element)){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(each);
            }
        }
    }
}
