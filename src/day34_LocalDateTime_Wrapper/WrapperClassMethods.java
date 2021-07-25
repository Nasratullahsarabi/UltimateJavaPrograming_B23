package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str ="123";
        int num = Integer.parseInt(str);
        int num1 = Integer.valueOf(str);

        int num3 = Integer.parseInt(str);

        Integer num4 = Integer.valueOf(str);
        System.out.println("==============================================");

        String s = "a1b2c3";

        int sum = 0;

        for (char each : s.toCharArray()){

            if (Character.isDigit(each)){
                Integer.parseInt(""+each);
            }
        }
    }
}
