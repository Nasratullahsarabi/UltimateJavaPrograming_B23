package day22_loopRecap;

public class charAndDigits {
    public static void main(String[] args) {
        String sentence = "aaaallllllllllldddddddddddfffffffffffffff", withOutDup = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ltrs = sentence.charAt(i);
            if (withOutDup.contains(""+ltrs)){
                continue;
            }
            withOutDup+= ltrs;
        }
        String result = ""; int freq = 0;
        for (int i = 0; i < withOutDup.length(); i++) {
            char ltrs1 = withOutDup.charAt(i);

            for (int j = 0; j < sentence.length(); j++) {
                char ltrs2 = sentence.charAt(j);

                if (ltrs1 == ltrs2){
                    freq++;
                }

            }
            result+=""+ltrs1+freq;

        }
        System.out.println("result = " + result);
    }
}
