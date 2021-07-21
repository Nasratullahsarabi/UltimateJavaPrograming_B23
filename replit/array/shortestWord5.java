package array;

import java.util.Arrays;

public class shortestWord5 {
    public static void main(String[] args) {

        String str = "olive, fh, puhh, old, ngljlkj, java, co, cjh, ra";

        String []words = str.split(",");

        String shortestWord = words[0];

        for(int i = 0;i < words.length;i++){
            if(words[i].length() < shortestWord.length()){
                shortestWord=words[i];
            }
        }
        System.out.println(shortestWord);
        String shorAll = "";

        for (int j = 0; j < words.length; j++) {

            if (words[j].length() == shortestWord.length()){
                shorAll+=words[j]+", ";
            }

        }
        String []arr = shorAll.split(", ");
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
