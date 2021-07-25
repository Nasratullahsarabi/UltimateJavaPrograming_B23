package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static ArrayList <String> removeAll (ArrayList<String> wordList, String targetWord){

        wordList.removeAll(Arrays.asList(targetWord));

        return wordList;
    }

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();

        wordList.addAll(Arrays.asList("tv", "mobile", "charger", "mobile", "usb"));
        String word = "mobile";



        System.out.println(removeAll(wordList,word));
    }
}
