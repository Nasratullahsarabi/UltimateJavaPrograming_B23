package whileLoop;

public class findCountOfWord {

    public static void main(String[] args) {

        String sentence = "I wanna go to mazar, mazar is mazar.";
        int count = 0;

        while (sentence.contains("mazar")){
            count++;
            sentence=sentence.replaceFirst("mazar","");
        }

        System.out.println(count);
    }
}
