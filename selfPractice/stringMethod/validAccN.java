package stringMethod;

public class validAccN {
    public static void main(String[] args) {
        String accN = "5677098678";

        if (accN.startsWith("2") && accN.length()==7 || accN.startsWith("5") && accN.length()==10){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
}
