package previousLessons;

import java.util.Scanner;

public class calanderConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte month = scan.nextByte(), day = scan.nextByte(); short year = scan.nextShort();
        int firstF = ((year-1)*365)+((4-1)*31)+15+345;
        int secondF= firstF+226899;
        int thirdF = secondF-500;
        int fourthF = thirdF/365+1;

        int converDay = thirdF%365-31-29-31-30-31-30;


    }
}
