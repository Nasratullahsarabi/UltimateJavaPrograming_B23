package day23_NestedLoops;

public class littersCount {
    public static void main(String[] args) {

        String str = "pppppppooooooooooRRRRRRRRR", rmvDup = "";
        for (int i = 0; i < str.length(); i++) {
            char dupltr = str.charAt(i);
            if (rmvDup.contains(""+dupltr)){
                continue;
            }
            rmvDup+=dupltr;
        }
        String result = "";
        for (int i = 0; i < rmvDup.length(); i++) {
            char countLtr = rmvDup.charAt(i);
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                char freqltr = str.charAt(j);
                if (freqltr == countLtr){
                    freq++;
                }

            }
            result+=""+countLtr+freq;

        }
        System.out.println("result = " + result);

    }
}
