package day34_LocalDateTime_Wrapper;

public class InterviewTask1 {
    public static void main(String[] args) {
        String s = "AAABBBCCC!@#4%&$81%~";

        String letters = "",
                digits = "",
                specialChar = "";

        for (char each : s.toCharArray()){
            if (Character.isDigit(each)){
                digits+= each;
            }else if (Character.isLetter(each)){
                letters+=(each);
            }else {
                specialChar+=(each);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);
    }
}
