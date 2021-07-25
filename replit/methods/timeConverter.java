package methods;

import java.util.Arrays;
import java.util.Scanner;

public class timeConverter {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }
    public static void timeConversion(String s){

        String military = "";
        if (s.contains("AM") && s.equals("12:00:00AM")){
            military = "00:00:00";
        }else {
            military = s.substring(0,s.length()-2);
        }

        String[] pm = s.split(":");
        int firstIndex = Integer.parseInt(pm[0]);

        if (s.contains("PM") && firstIndex == 12){
            military = (firstIndex)+s.substring(2,s.length()-2);
        }else if (s.contains("PM") && firstIndex < 12){
            military = (firstIndex+12)+":"+pm[1]+":"+pm[2];
            military = military.substring(0,military.length()-2);
        }
        System.out.println(military);
    }
}
