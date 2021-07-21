package array;

import java.util.Scanner;

public class divingScore2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0; int [] score = new int[3];

        int sum = 0; int max = score [0]; int min = score[0]; int result= 0;


        for (int i = 0; i < 3; i++) {
            count++;
            System.out.println("Enter score for judge "+count+":");
            score[i] = scan.nextInt();
            sum += score[i];
            if (score[i] > max){
                max = score[i];
            }
            if (score[i] < min){
                min = score[i];
            }
        }
        System.out.println("Enter diffculty number");
        int difficulty = scan.nextInt();
        result =  (min);

        System.out.println(result);
    }
}