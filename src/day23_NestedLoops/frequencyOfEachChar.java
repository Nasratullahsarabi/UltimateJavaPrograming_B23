package day23_NestedLoops;

public class frequencyOfEachChar {
    public static void main(String[] args) {
        String str = "aabcccd"; String removeDup = ""; 

        for (int i = 0; i < str.length(); i++) {
            char eachD = str.charAt(i);
            if (removeDup.contains(""+eachD)){
                continue;
            }
            removeDup+= eachD;
        }
        String result = "";
        for (int j = 0; j < removeDup.length(); j++) {

        char ch = removeDup.charAt(j);int freq = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachF = str.charAt(i);
            if (eachF == ch){
                freq++;
            }

        }
        result+=""+ch+freq;
        }
        System.out.println(result);

    }
}
