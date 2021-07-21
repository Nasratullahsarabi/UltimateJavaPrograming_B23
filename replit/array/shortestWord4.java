package array;

import java.util.Arrays;

public class shortestWord4 {
    public static void main(String[] args) {

        String str = "olu fish puhh old ngljlkj java co j";
        int min = 0;
        String []words = str.split(" ");
        System.out.println(Arrays.toString(words));
        int shortestWord = words[0].length();

        for(int i = 0;i < words.length;i++){
            if(words[i].length() < shortestWord){
                min+=i;
                shortestWord=words[i].length();

            }
        }
        System.out.println(words[min]);
    }
}
