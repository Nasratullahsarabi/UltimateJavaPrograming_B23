package array;

public class has55 {
    public static void main(String[] args) {

        int []num = {1, 5, 4, 1, 5}; int count = 0;
        String result = "";

        for (int i = 0; i <= num.length-2; i++) {

            if (num[i] == 5 && num[i+1] == 5){
                count++;
            }
            if (count >=1){
                result = "true";
            }else {
                result = "false";
            }
        }

        System.out.println(result);
    }
}
