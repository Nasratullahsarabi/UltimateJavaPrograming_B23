package methods;

import java.util.Scanner;

public class waterBill {
    public static double waterTax(double units){

        return (units <= 50)?units*0.6:(units <= 100)?units*0.9:(units <= 150)?units*0.9+50:units*0.9+100;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));


        in.close();
    }
}
