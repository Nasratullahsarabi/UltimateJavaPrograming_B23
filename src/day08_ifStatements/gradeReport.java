package day08_ifStatements;

public class gradeReport {
    public static void main(String[] args) {
        /*
        score
        grade:
        A: 90<=90 score <=100
        B: 90<= score <=89
        C: 70<=70 score <=79
        D:
         */
    int score = 55;
    if(score>=90 && score<=100){
        System.out.println("Excelent you made an A");
    }
    if (score>=80 && score<=89){
        System.out.println("Good job you made a B");
    }
    if (score>=70 && score<=79){
        System.out.println("Good you made a c");
    }
    if(score>=60 && score<=69){
        System.out.println("you made a D");
    }
    if (score<60){
        System.out.println("you faild");
    }
    }
}
