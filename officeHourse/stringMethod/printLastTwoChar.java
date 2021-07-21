package stringMethod;

public class printLastTwoChar {
    public static void main(String[] args) {
        String input = "helto";
        char lastChar = input.charAt(input.length()-3);
        char lastChar1 = input.charAt(input.length()-2);

        System.out.println(lastChar+""+lastChar1+""+lastChar+""+lastChar1+""+lastChar+""+lastChar1);

    }
}
