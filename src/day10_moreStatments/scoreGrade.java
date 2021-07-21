package day10_moreStatments;

public class scoreGrade {
    public static void main(String[] args) {
        int score = 90;
        char grade=(score>90)? 'A' :(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';

        System.out.println("grade = " + grade);
    }
}
