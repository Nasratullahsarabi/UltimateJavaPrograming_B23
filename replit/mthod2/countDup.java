package mthod2;

import java.util.Scanner;

public class countDup {
    public static int getDup (String [] r){
        int count = 0;
        for (String each : r){
            if (frequency(r, each)>1) {
                count++;
            }
        }
        return count;
    }

    public static int frequency (String []str, String word){
        int count = 0;
        for (String each: str){
            if (each.equals(word)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] strs = new String[scan.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = scan.next();
        }

        System.out.println(getDup(strs));
    }

    }
