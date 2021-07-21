package day4_Practice;

public class googleSearch {
    public static void main(String[] args) {
        String word = "About 640,000 results (0.78 seconds)";
        int indextOfSpace = word.indexOf(" ");
        int indextOfScndSpace = word.indexOf(" r");
        int indextOfThirdSpace = word.indexOf("(");
        int indextOfLast = word.indexOf(")");

        String firstWord = word.substring(indextOfSpace,indextOfScndSpace);
        String secondWord = word.substring(indextOfThirdSpace+1,indextOfLast);

        System.out.println("Result number is "+firstWord);
        System.out.println("Response time is "+secondWord);



    }
}
