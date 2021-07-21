package methods;

import java.util.Scanner;

public class hamletQuote {
    public static boolean halmletQoute(boolean toBe, boolean notToBe){

        return (toBe == false && notToBe == false)?false:true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(halmletQoute(in.nextBoolean(), in.nextBoolean()));

        in.close();
    }
}
