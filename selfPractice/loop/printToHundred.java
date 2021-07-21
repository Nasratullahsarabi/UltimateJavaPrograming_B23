package loop;

import java.util.Scanner;

public class printToHundred {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();  int total = 0;
         for (int i = num; i < 10; i++){
             total = i;
             System.out.print(total+" ");

         }

         scan.close();

    }
}
