package array;

import java.util.Scanner;

public class divingPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0; int score = 0; int sum = 0; int max = -1; int min = 11;double result=0.0;

        for (int i = 0; i < 7; i++) {
            count++;
            System.out.println("Enter score for judge "+count+":");
            score = scan.nextInt();
            sum+=score;
            if (score > max){
                max = score;
            }
            if (score < min){
                min = score;
            }
        }
        System.out.println("Enter diffculty number");
        double difficulty = scan.nextDouble();
        result =  (sum-max-min)*difficulty*0.6;

        System.out.println(result);
    }
}
