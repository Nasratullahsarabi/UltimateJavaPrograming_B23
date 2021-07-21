package day23_NestedLoops;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {

        String []days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = new Scanner(System.in).nextInt();

        if (n>=1 && n<=7){
            System.out.println(days[n-1]);
        }else {
            System.out.println("invalid");
        }
    }
}
