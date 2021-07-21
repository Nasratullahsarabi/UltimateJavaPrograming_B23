package charPractice;

public class classPractice {
    public static void main(String[] args) {
        String sentense = "I studied SDLC in Cybertek School";
        char firstLetter = sentense.charAt(0);
        System.out.println("firstLetter = " + firstLetter);
        int lastIndex = sentense.length()-1;
        char lastLetter = sentense.charAt(lastIndex);
        System.out.println("lastLetter = " + lastLetter);

        String car = "Toyota";
        char totalValue = car.charAt(2);

        System.out.println(totalValue);
        System.out.println("===============");

        String tv = "LGbestmovie";
        char letter = tv.charAt(5);

        System.out.println("letter = " + letter);

    }
}
