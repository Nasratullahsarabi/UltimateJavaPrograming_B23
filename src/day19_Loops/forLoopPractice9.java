package day19_Loops;

public class forLoopPractice9 {
    public static void main(String[] args) {

        String word = "aeedddffff"; char ch = 'e'; String result = "";


        for (int j = 0; j < word.length(); j++) {
            int freq = 0;
            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(i) == word.charAt(j)){
                    freq++;
                    }
            }
            if (freq >= 3){

                result += freq;
            }

        }
        System.out.println(result);














    }
}
