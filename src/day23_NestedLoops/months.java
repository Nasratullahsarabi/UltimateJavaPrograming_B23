package day23_NestedLoops;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        String[]months = {"Jan", "Feb", "Mar", "Ap", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int n = new Scanner(System.in).nextInt();

        if (n>=0&&n<=12){
            System.out.println(months[n-1]);
        }else {
            System.out.println("invalid");
        }

    }
}
