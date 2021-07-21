package day18_StringPractice;

import java.util.Scanner;

public class findAWordWithOutFirstLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();

/*
        if (word.startsWith("x") || word.startsWith("X")){  //if(word.charAt(0) == 'x')
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);


        }

 */


        if (word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
        System.out.println("=========================");

        String word1 = "java";
        if (word1.toLowerCase().startsWith("j")){
            System.out.println("Ok");
        }else {
            System.out.println("not ok");
        }





        scan.close();
    }
}
/*
Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */