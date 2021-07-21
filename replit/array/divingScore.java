package array;

import java.util.Scanner;

public class divingScore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0; float [] score = new float[7];

        int sum = 0; float max = score [0]; float min = score[0]; float result= 0.0F;


        for (int i = 0; i < 7; i++) {
            count++;
            System.out.println("Enter score for judge "+count+":");
            score[i] = scan.nextFloat();
            sum += score[i];
            if (score[i] > max){
                max = score[i];
            }
            if (score[i] < min){
                min = score[i];
            }
        }
        System.out.println("Enter diffculty number");
        float difficulty = scan.nextFloat();
        result =  (sum - max - min)*difficulty*0.6F;

        System.out.println(result);
    }
}