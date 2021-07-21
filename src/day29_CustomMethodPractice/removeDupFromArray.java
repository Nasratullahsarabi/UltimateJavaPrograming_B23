package day29_CustomMethodPractice;

public class removeDupFromArray {
    public static void main(String[] args) {

        System.out.println(rmvDup("aabbcccdddlk"));

    }
    public static String rmvDup (String str){
        String result = "";

        for (char each : str.toCharArray()){

            if (result.contains(""+each)){
                result+=each;
            }
        }
        return result;
    }
}
