package loop;

public class findUniqLetter2 {
    public static void main(String[] args) {
        String word = "nassrrat";
        String result = "";
        for (int i = 0; i <= word.length()-1;i++){
            char uniqeChar = word.charAt(i);
            boolean isUnique = word.indexOf(uniqeChar) == word.lastIndexOf(uniqeChar);
            if (isUnique){
                result += uniqeChar;
            }
        }
        System.out.println(result);
        System.out.println();
        System.out.println("=========================================");

        String word2 = "mmuzzafar", result2 = "";

        for (int i = 0; i <= word2.length()-1; i++) {
            char uniqe2 = word2.charAt(i);
            boolean isUniqe2 = word2.indexOf(uniqe2) == word2.lastIndexOf(uniqe2);

            if (isUniqe2){
                result2 += uniqe2;
            }

        }

        System.out.println(result2);
    }
}
