package day5;

public class findTheLongestChars {
    public static void main(String[] args) {
        String str = "aaaaaabbbbbccddeee";
        String longest = "", result = "";

        for (int i = 0; i < str.length()-1; i++) {
            result+=str.charAt(i);

            if (str.charAt(i) != str.charAt(i+1) || i == str.length()-2){
                if (str.charAt(i) == str.charAt(i+1)){
                    result+=str.charAt(i);
                }
                if (result.length() > longest.length()){
                    longest = result;
                }
                result="";
            }

        }
        System.out.println(longest);

    }
}
