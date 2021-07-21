package day20_loopPractice;

public class frequencyOfWord1 {
    public static void main(String[] args) {
        String sentence = "java java";
        int count =0;

        for (int i = 0; i <= sentence.length()-4;i++){
            String each = sentence.substring(i,i+4);
            if (each.equals("java")){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();

        System.out.println("====================================");
        String phrase = "nasrat nasrat nasrat Nasrat"; int count1 = 0;

        for (int i = 0; i <= phrase.length()-6;i++){
            String word = phrase.substring(i , i + 6);
            if (word.equalsIgnoreCase("Nasrat")){
                count1++;
            }
        }
        System.out.println("count "+count1);
    }
}
