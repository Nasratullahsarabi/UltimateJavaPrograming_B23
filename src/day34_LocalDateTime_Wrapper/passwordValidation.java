package day34_LocalDateTime_Wrapper;

public class passwordValidation {
    public static void main(String[] args) {
        String password = "yberek12$%";

        boolean pasSize = password.length() >= 8 && !password.contains(" ");
        boolean upperCase = false,
                lowerCase = false,
                digits = false,
                specialChar = false;

        for (char each : password.toCharArray()){
            if (Character.isUpperCase(each)){
                upperCase = true;
            }else if (Character.isLowerCase(each)){
                lowerCase = true;
            }else if (Character.isDigit(each)){
                digits = true;
            }else {
                specialChar = true;
            }
        }
        boolean isStrong = pasSize&&upperCase&&lowerCase&&digits&&specialChar;

        System.out.println(isStrong);

    }
}
