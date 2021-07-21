package day20_loopPractice;

public class catDog2 {
    public static void main(String[] args) {

        String sentence = "cat catcatdogcat dog dog dog dog";
        int dogCount = 0, catCount = 0;

        for (int i = 0; i <= sentence.length()-3; i++) {
            String eachDog = sentence.substring(i,i+3);
            String eachCat = sentence.substring(i,i+3);

            if (eachDog.equalsIgnoreCase("dog")){

                dogCount++;
            }
            if (eachCat.equalsIgnoreCase("cat")){
                catCount++;
            }
        }
        System.out.println("dogCount = " + dogCount);
        System.out.println("catCount = " + catCount);
        boolean isEqual = catCount == dogCount;

        System.out.println("isEqual = " + isEqual);
    }
}
