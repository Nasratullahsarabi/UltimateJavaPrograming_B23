package utilities1;

import java.util.Arrays;

public class ArrayUtility {
    // Add an element to an int array
    public static int[] addElement (int[]arr, int num){
        int result[] = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1] = num;

        return result;
    }

    // Add an element to a double array
    public static double[] addElement (double[] arr, double num){
        double []array = Arrays.copyOf(arr,arr.length+1);
        array[array.length-1] = num;
        return array;
    }

    // Add an element to a string array
    public static String[] addElement (String []str, String word){

        String[]result = Arrays.copyOf(str,str.length+1);
        result[result.length-1] = word;
        return result;
    }

    // Add an element to a char array
    public static char[] addElement (char[]ch, char lttr){

        char[]result = Arrays.copyOf(ch,ch.length+1);
        result[result.length-1] = lttr;
        return result;
    }

    // Find maximum number from an int array
    public static int max (int []arr){
        int max = arr[0];

        for (int each : arr){
            max = Math.max(max,each);
        }
        return max;
    }

    // Find maximum number from a double array
    public static double max (double[]arr){

        double max = arr[0];

        for (double each: arr){

            max = Math.max(max, each);
        }
        return max;
    }

    // Find minimum number from an int array
    public static int min(int [] arr){
        int result = arr[0];
        for (int each : arr){
            result = Math.min(each,result);
        }
        return result;
    }

    // Find minimum number from a double array
    public static double min (double[]arr){

        double min = arr[0];
        for (double each: arr){
            min = Math.min(each,min);
        }
        return min;
    }

    //Merge two int arrays
    public static int [] merge(int[]arr1, int[]arr2){

        int []merge = Arrays.copyOf(arr1, arr1.length+arr2.length);
        int i = arr1[arr1.length-1];
        for (int each : arr2){
            merge[i++] = each;
        }
        return merge;
    }

    //Merge two double arrays
    public static double [] merge (double []arr1, double[]arr2){
        double[]merge = Arrays.copyOf(arr1, arr1.length+arr2.length);

        int i = arr1.length;
        for (double each : arr2){
            merge[i++] = each;
        }
        return merge;
    }

    //Merge two string arrays
    public static String[] merge (String []str1, String []str2){

        String[]merge = Arrays.copyOf(str1, str1.length+str2.length);
        int i = str1.length;
        for (String each : str2){
            merge[i++] = each;
        }
        return merge;
    }

    //Merge two char arrays
    public static char[]merge (char[]ch1, char[]ch2){
        char[]merge = Arrays.copyOf(ch1, ch1.length+ch2.length);
        int i = ch1.length;
        for (char each: ch2){
            merge[i++] = each;
        }
        return merge;
    }

    //This method removes one element from an int array
    public static int [] remove (int[]arr, int index){

        int result[] = new int[arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i == index){
                continue;
            }else {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    //This method removes one element from an double array
    public static double[] remove (double[]arr, int index){

        double result [] = new double[arr.length-1];
        int j = 0;
        for(int i = 0;i < arr.length;i++){
            if (i == index){
                continue;
            }else {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    //This method removes one element from a string array
    public static String[] remove (String []str, int index){
        String []result = new String[str.length-1];
        int j = 0;
        for (int i = 0; i < str.length; i++) {

            if (i == index){
                continue;
            }else {
                result[j++] = str[i];
            }
        }
        return result;
    }

    //This method removes one element from a char array
    public static char[] remove (char[]ch, int index){

        char[]result = new char[ch.length-1];

        int j = 0;
        for (int i = 0; i < ch.length; i++) {
            if (i == index){
                continue;
            }else {
                result[j++] = ch[i];
            }
        }
        return result;
    }

    //This method revers an int array
    public static int []revers(int[]arr){
        int []result = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            result[j++] = arr[i];
        }
        return result;
    }

    //This method revers a double array
    public static double []revers(double[]arr){
        double []result = new double[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            result[j++] = arr[i];
        }
        return result;
    }

    //This method revers a string array
    public static String []revers(String[]arr){
        String []result = new String[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            result[j++] = arr[i];
        }
        return result;
    }

    //This method revers a char array
    public static char []revers(char[]arr){
        char []result = new char[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            result[j++] = arr[i];
        }
        return result;
    }

    //This method shows a number contains in an int array
    public static boolean contains (int []array, int element){
        for (int each : array){
            if (each == element){
                return true;
            }
        }
        return false;
    }

    //This method shows a number contains in a double array
    public static boolean contains (double[]array, double element){

        for (double each: array){
            if (each == element){
                return true;
            }
        }
        return false;
    }

    //This method shows a word contains in a String array
    public static boolean contains (String []str, String word){

        for (String each : str){
            if (each.equals(word)){
                return true;
            }
            }
        return false;
        }

    //This method shows a char contains in a char array
    public static boolean contains (char []ch, char lttr){
        for (char each : ch ){

            if (each == lttr){
                return true;
            }
        }
        return false;
    }

    // This method count the frequency of a number in an int array
    public static int frequency (int[]arr, int element){
        int count = 0;
        for (int each: arr){
            if (each == element){
                count++;
            }
        }
        return count;

    }

    // This method count the frequency of a number in a double array
    public static int frequency (double[]arr, double element){
        int count = 0;

        for (double each : arr){
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // This method count the frequency of a word in a String array
    public static int frequency (String []str, String word){
        int count = 0;
        for (String each : str){
            if (each.equals(word)){
                count++;
            }
        }
        return count;
    }

    // This method count the frequency of a char in an char array
    public static int frequency (char [] ch, char lttr){
        int count = 0;
        for (char each: ch){
            if (each==lttr){
                count++;
            }
        }
        return count;
    }

    public static int[] unique(int []arr){
        int[]result = {};
        for (int each : arr){
            if (frequency(arr, each) == 1){
                result = addElement(result,each);
            }
        }
        return result;
    }

    public static double[]unique(double[]arr){
        double result[] = {};

        for (double each : arr) {

            if (frequency(arr,each) == 1){
                result = addElement(result,each);
            }
        }
        return result;
    }

    public static String[]unique(String[] str){

        String[]result = {};
        for (String each : str) {

            if (frequency(str,each) == 1){
                result = addElement(result,each);
            }

        }
        return result;
    }

    public static char[]unique(char[] ch){

        char[]result = {};
        for (char each : ch) {

            if (frequency(ch, each) == 1){
                result = addElement(result, each);
            }
        }
        return result;
    }

    public static int[]removeDup(int[]arr){

        int[]result = {};

        for (int each: arr){
            if (!contains(result,each)){
                result = addElement(result,each);
            }
        }
        return result;
    }

    public static double[]removeDup(double[]arr){

        double result[] = {};

        for (double each : arr){
            if (!contains(result, each)){
                result = addElement(result,each);
            }
        }
        return result;
    }

    public static String []removeDup(String[]str){
        String result [] = {};

        for (String each : str) {

            if (!contains(result,each)){
                result = addElement(result,each);
            }

        }
        return result;
    }

    public static char []removeDup (char[]ch){

        char result[] = {};

        for (char each : ch) {
            if (!contains(result, each)) {

                result = addElement(result,each);
            }

        }
        return result;
    }

}



