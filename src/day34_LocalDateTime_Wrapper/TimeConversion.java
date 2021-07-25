package day34_LocalDateTime_Wrapper;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }
    public static void timeConversion (String s){
        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(String.format(s, TF));
    }
}
