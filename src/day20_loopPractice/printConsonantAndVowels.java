package day20_loopPractice;

public class printConsonantAndVowels {
    public static void main(String[] args) {
        String vowel = "", consonant = "";

        for (char i = 'a';i <= 'z';i++){
            if (i == 'a' || i == 'e'|| i == 'i'|| i == 'o'|| i == 'u'){
                vowel+=i+" ";
            }else {
                consonant+=i+" ";
            }
        }
        System.out.println("Vowel Letters: "+vowel);
        System.out.println("Consonant Letters: "+consonant);
    }
}
