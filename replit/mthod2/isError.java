package mthod2;

import utilities.ArraysUtility;

public class isError {
    public static void main(String[] args) {
        String isError = "error foo bar";
        String str[] = isError.split(" ");

        boolean retur = false;

            if (str[0].equals("error")){
                retur = true;
            }else {
                retur = false;
            }


        System.out.println(retur);
    }
}
