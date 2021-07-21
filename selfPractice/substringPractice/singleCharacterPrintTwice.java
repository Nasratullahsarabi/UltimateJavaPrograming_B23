package substringPractice;

public class singleCharacterPrintTwice {
    public static void main(String[] args) {
        String character = "A";
        String twice = character.concat(character+""+character);
        System.out.println(twice);
    }
}
