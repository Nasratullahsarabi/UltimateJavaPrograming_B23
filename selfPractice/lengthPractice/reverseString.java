package lengthPractice;

public class reverseString {
    public static void main(String[] args) {
        String city = "Kabul"; String result = "";
        if (city.length() == 5){
                result += city.charAt(4);
                result += city.charAt(3);
                result += city.charAt(2);
                result += city.charAt(1);
                result += city.charAt(0);

        }else {
            result ="invalid";
        }
        System.out.println("result = " + result);
    }
}
