package whileLoop;

public class JavaCount {
    public static void main(String[] args) {
        String sentence = "java java java python python python";
        String word1 = "java", word2 = "python";
        int countJ = 0, countP = 0;

        for (int i = 0; i < sentence.length() - (word1.length()) && i < sentence.length() - word2.length(); i++) {
            String eachJava = sentence.substring(i, i + word1.length());
            String eachPython = sentence.substring(i, i + word2.length());

            if (eachJava.equalsIgnoreCase("java")) {
                countJ++;
            }
            if (eachPython.equalsIgnoreCase("python")) {
                countP++;
            }

        }
        System.out.println("countJ = " + countJ);
        System.out.println("countP = " + countP);
    }
}



