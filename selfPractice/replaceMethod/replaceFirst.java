package replaceMethod;

public class replaceFirst {
    public static void main(String[] args) {
        String sentence = "I studied SDLC in Cybertek School";
        sentence = sentence.replace("S","z");
        System.out.println("sentence = " + sentence);
        System.out.println("==========================");

        String sentence2 = "Bathy Bothy bought some butter which is bitter and better";

        System.out.println("============================");
        sentence2 = sentence2.replaceFirst("oth","oCC");
        System.out.println("sentence2 = " + sentence2);
        System.out.println("============================");
        String joke = "do boz doz boz doz dedand";
        joke = joke.replaceFirst("doz","dos");

        System.out.println("joke = " + joke);
    }
}
