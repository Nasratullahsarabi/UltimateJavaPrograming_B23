package day24_Arrays;

import java.util.Arrays;

public class grade {
    public static void main(String[] args) {
String[]names={"Nasrat", "Ateeq", "Jawad", "Hedayat", "Wahid", "Hashmat", "Muzafar"};
int[] scores = {100, 50, 40, 90, 80, 30, 60};
char[]grade = new char[names.length];
        for (int i = 0; i < names.length; i++) {

            if (scores[i]>=90){
                grade[i] = 'A';
            }else if (scores[i]>=80){
                grade[i] = 'B';
            }else if (scores[i]>=70){
                grade[i] = 'C';
            }else if (scores[i]>=60){
                grade[i] = 'D';
            }else {
                grade[i]='F';
            }
            Arrays.sort(grade);
            System.out.println(names[i]+" "+scores[i]+" "+grade[i]);
        }
    }
}
