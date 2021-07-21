package mthod2;

public class cleanString {
    public static void main(String[] args) {
        String str = "aa2aa3";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'  ){
                result+=str.charAt(i);
            }

        }

        System.out.println(result);


    }
}
