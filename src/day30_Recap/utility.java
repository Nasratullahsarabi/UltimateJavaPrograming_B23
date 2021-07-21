package day30_Recap;

public class utility {
    public static void main(String[] args) {
        String sentence = "Nas ndh Asadu arj ateeq brhj bv.";

        String[]array = sentence.split(" ");

        String longest = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i].length() > longest.length()){
                longest = array[i];
            }
        }
        System.out.println("Longest Word: "+longest);
        System.out.println("====================================");



        String shortest = array[0];
        for (int j = 0; j <= array.length-1; j++) {

            if (array[j].length() < shortest.length()){
                shortest = array[j];
            }
            if (j == array.length-1){
                if (shortest.length() > array[j].length()-1){
                    shortest = array[j];
                }


            }
        }
        System.out.println("Shortest Word "+shortest);
    }
}
