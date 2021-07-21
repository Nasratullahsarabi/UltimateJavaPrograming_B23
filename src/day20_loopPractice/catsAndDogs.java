package day20_loopPractice;

public class catsAndDogs {
    public static void main(String[] args) {
        String sentence = "cat dog cat dog dot cat cat";
        int cat = 0, dog =0;
        for (int i = 0; i < sentence.length()-3; i++) {
            String dogCount = sentence.substring(i,i+3);
            String catCount = sentence.substring(i,i+3);
            if (dogCount.equalsIgnoreCase("dog")){
                dog++;
            }
            if (catCount.equalsIgnoreCase("cat")){
                cat ++;
                }
            }
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);

        boolean isEqual = dog == cat;

        System.out.println("isEqual = " + isEqual);

        }

    }

