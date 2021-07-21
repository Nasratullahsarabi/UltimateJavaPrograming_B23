package loopReplits;

public class findJavaAndPython {
    public static void main(String[] args) {
        String sentence = "what's different between java, javascript and python?";
        int countPython = 0, countJava = 0;

        for (int i = 0; i <= sentence.length()-6; i++) {
            String eachPython = sentence.substring(i,i+6);
            String eachJava   = sentence. substring(i,i+4);

            if (eachPython.equals("python")){
                countPython++;
            }
            if (eachJava.equals("java")){
                countJava++;
            }

        }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);

        boolean notEqual = countJava==countPython;

        System.out.println("notEqual = " + notEqual);
    }
}
