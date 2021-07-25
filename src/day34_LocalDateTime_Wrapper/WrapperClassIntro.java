package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {

       String str = "123";

       int num = Integer.parseInt(str);

       int sum = num+2;
        //System.out.println(sum);

        Integer num2 = Integer.valueOf(str);
        int sum2 = num2+4;

        //System.out.println(sum2);

        String str2 = "true";
        String str3 = "false";

        boolean r = Boolean.parseBoolean(str2);
        boolean m = Boolean.parseBoolean(str3);

        char ch = '4';

        boolean isDigit = Character.isDigit(ch);
        boolean isletter = Character.isLetter(ch);
        boolean isSpecialChar = Character.isSpaceChar(ch);
        System.out.println("===========================================");

        String s = "a4u1b2cj3";
        String digit  = "";
        String chars = "";

        for (char each : s.toCharArray()){

            if (!Character.isDigit(each)){
                chars+=each;
            }else {
                digit+=each;
            }
        }
        System.out.println(digit);
        System.out.println(chars);
        System.out.println("================================");

        String p = "rt34al8ik2";
        int sum5 = 0;

        for (char each : p.toCharArray()){
            if (Character.isDigit(each)){
                sum5+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum5);




    }
}
