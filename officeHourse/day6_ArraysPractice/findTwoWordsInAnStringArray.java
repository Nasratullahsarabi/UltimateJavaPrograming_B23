package day6_ArraysPractice;

public class findTwoWordsInAnStringArray {
    public static void main(String[] args) {
        String word = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[]str = word.split(", ");

        for (int i = 0; i < str.length; i++) {

            if (str[i].contains(" ")){
                System.out.println(str[i]);
            }

        }
    }
}
