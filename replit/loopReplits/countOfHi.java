package loopReplits;

public class countOfHi {
    public static void main(String[] args) {
        String sentence = "hi i wannt say hi"; int countHi = 0;

        for (int i = 0; i <= sentence.length()-2; i++) {
            String eachHi = sentence.substring(i,i+2);
            if (eachHi.equals("hi")){
                countHi++;
            }
        }
        System.out.print(countHi);
    }
}
