package day20_loopPractice;

public class sumOfDigits {
    public static void main(String[] args) {
        String sentence = "aBC2dAf4J1h3i2g";
        int sum = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char digit = sentence.charAt(i);
            if (digit >= '0' && digit <= '9'){
                sum+=digit - 48;
            }

        }
        System.out.println(sum);
    }
}
