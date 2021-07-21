package day33_MethodOverLoadPractice;

public class warmUpTask4 {
    public static void main(String[] args) {

        String str = "aaabbbcc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }

        }
        System.out.println(result);
        System.out.println("===========================================");

        int []array = {1,2,3,4,5,5,6,6,4,4,2,4,3,};
        int[]newArr={};
        for (int each : array){


        }
    }

}
