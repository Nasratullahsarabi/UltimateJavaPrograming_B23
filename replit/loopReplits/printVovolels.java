package loopReplits;

public class printVovolels {
    public static void main(String[] args) {

        String word = "howiedyho"; String vavols = "";

        for (int i = 0; i < word.length();i++) {

            if (word.charAt(i) =='a' || word.charAt(i) =='e'|| word.charAt(i) =='i'||
                    word.charAt(i) =='o'|| word.charAt(i) =='u'){
                vavols+=word.charAt(i);
            }
        }
        System.out.print(vavols);

    }
}
