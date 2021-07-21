package day28_CustomeMethod;

import java.util.Locale;

public class gradeReport {
    public static void main(String[] args) {
        gradeReport(30);
        reversString("ateeq");
        uniqElement(new String[]{"a","b","c","c"});
        palindrome("level");
        removeDuplicate("ababababjjklmnn");
        maximumNum(new int[]{10,2,3,4,7,5,3,9});
        minimumNum(new int[]{2,3,4,5,6,2,1});

    }
    public static void gradeReport(int score){
        String grade = "";
        if (score <= 100){
            if (score>=90){
                grade = "A";
            }else if (score >=80){
                grade = "B";
            }else if (score >=70){
                grade = "C";
            }else if (score >=60){
                grade = "D";
            }else {
                grade = "F";
            }
        }else {
            System.out.println("Invalid number");
        }
        System.out.println("Your grade is: "+grade);
    }

    public static void reversString (String revers){

        for (int i = revers.length()-1;i >= 0;i--){
            System.out.print(revers.charAt(i));
        }
        System.out.println();
    }

    public static void uniqElement (String[]arr){

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])){
                    count++;
                }
            }
            if (count == 1){
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    public static void palindrome(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {

            for (int j = word.length()-1; j >= 0 ; j--) {

                if (word.charAt(i) == word.charAt(j)){
                    result = "true";
                }else {
                    result = "false";
                }
            }
        }
        System.out.println(result);
    }

    public static void removeDuplicate (String word){
        String removeDup = "";

        for (int i = 0;i < word.length();i++){

            if (!removeDup.contains(""+word.charAt(i))){
                removeDup+=word.charAt(i);
            }
        }
        System.out.println(removeDup);
    }

    public static void maximumNum(int[]arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);


    }

    public static void minimumNum(int[]arr){
        int min = arr[0];

        for (int i = 0;i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }







}
