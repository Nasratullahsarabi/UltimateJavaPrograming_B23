package methods;

import java.util.Scanner;

public class profitLoss {
    public static String profits(int buyPrice, int salePrice){


        return ((salePrice - buyPrice) > 0)?"profit":((salePrice - buyPrice)<0 )?"loss":"no lose";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));


        in.close();
    }
}
