package day4_Practice;

public class firstWordRemoved {
    public static void main(String[] args) {
        String sentence = "Java is a fun language";
        int indexOfSpace = sentence.indexOf(" ");
        String newSentence = sentence.substring(indexOfSpace);

        System.out.println(newSentence+" "+sentence.substring(0,indexOfSpace));

    }
}
/*
Disply the sentence with the first word moved to the end of sentence
 */